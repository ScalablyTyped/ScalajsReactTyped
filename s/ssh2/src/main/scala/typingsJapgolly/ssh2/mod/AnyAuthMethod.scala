package typingsJapgolly.ssh2.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ssh2.mod.NoAuthMethod
  - typingsJapgolly.ssh2.mod.PasswordAuthMethod
  - typingsJapgolly.ssh2.mod.HostBasedAuthMethod
  - typingsJapgolly.ssh2.mod.PublicKeyAuthMethod
  - typingsJapgolly.ssh2.mod.AgentAuthMethod
  - typingsJapgolly.ssh2.mod.KeyboardInteractiveAuthMethod
*/
trait AnyAuthMethod extends StObject
object AnyAuthMethod {
  
  inline def AgentAuthMethod(agent: (BaseAgent[String | Buffer | ParsedKey]) | String, username: String): typingsJapgolly.ssh2.mod.AgentAuthMethod = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("agent")
    __obj.asInstanceOf[typingsJapgolly.ssh2.mod.AgentAuthMethod]
  }
  
  inline def HostBasedAuthMethod(key: ParsedKey | Buffer | String, localHostname: String, localUsername: String, username: String): typingsJapgolly.ssh2.mod.HostBasedAuthMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hostbased")
    __obj.asInstanceOf[typingsJapgolly.ssh2.mod.HostBasedAuthMethod]
  }
  
  inline def KeyboardInteractiveAuthMethod(
    prompt: (String, String, String, js.Array[Prompt], KeyboardInteractiveCallback) => japgolly.scalajs.react.Callback,
    username: String
  ): typingsJapgolly.ssh2.mod.KeyboardInteractiveAuthMethod = {
    val __obj = js.Dynamic.literal(prompt = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: js.Array[Prompt], t4: KeyboardInteractiveCallback) => (prompt(t0, t1, t2, t3, t4)).runNow()), username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyboard-interactive")
    __obj.asInstanceOf[typingsJapgolly.ssh2.mod.KeyboardInteractiveAuthMethod]
  }
  
  inline def NoAuthMethod(username: String): typingsJapgolly.ssh2.mod.NoAuthMethod = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("none")
    __obj.asInstanceOf[typingsJapgolly.ssh2.mod.NoAuthMethod]
  }
  
  inline def PasswordAuthMethod(password: String, username: String): typingsJapgolly.ssh2.mod.PasswordAuthMethod = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("password")
    __obj.asInstanceOf[typingsJapgolly.ssh2.mod.PasswordAuthMethod]
  }
  
  inline def PublicKeyAuthMethod(key: ParsedKey | Buffer | String, username: String): typingsJapgolly.ssh2.mod.PublicKeyAuthMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("publickey")
    __obj.asInstanceOf[typingsJapgolly.ssh2.mod.PublicKeyAuthMethod]
  }
}
