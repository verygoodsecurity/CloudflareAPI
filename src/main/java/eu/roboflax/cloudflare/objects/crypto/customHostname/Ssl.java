package eu.roboflax.cloudflare.objects.crypto.customHostname;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Ssl {

  @SerializedName("method")
  @Expose
  private Method method;

  @SerializedName("type")
  @Expose
  private Type type;

  @SerializedName("settings")
  @Expose
  private Settings settings;
}
