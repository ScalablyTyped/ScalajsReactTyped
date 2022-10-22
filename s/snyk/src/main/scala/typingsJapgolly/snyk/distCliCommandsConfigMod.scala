package typingsJapgolly.snyk

import typingsJapgolly.snyk.snykStrings.clear
import typingsJapgolly.snyk.snykStrings.get
import typingsJapgolly.snyk.snykStrings.set
import typingsJapgolly.snyk.snykStrings.unset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsConfigMod {
  
  @JSImport("snyk/dist/cli/commands/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: set | get | unset | clear, args: String*): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(method.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[String]]
  inline def default(method: Unit, args: String*): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(method.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[String]]
}
