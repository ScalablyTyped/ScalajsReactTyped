package typingsJapgolly.sudoPrompt

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.sudoPrompt.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sudo-prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(cmd: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exec(
    cmd: String,
    options: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def exec(
    cmd: String,
    options: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ],
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def exec(
    cmd: String,
    options: Unit,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def exec(cmd: String, options: Env): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def exec(
    cmd: String,
    options: Env,
    callback: js.Function3[
      /* error */ js.UndefOr[js.Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
