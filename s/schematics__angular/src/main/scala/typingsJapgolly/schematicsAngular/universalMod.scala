package typingsJapgolly.schematicsAngular

import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typingsJapgolly.schematicsAngular.universalSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object universalMod {
  
  @JSImport("@schematics/angular/universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Schema): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
}
