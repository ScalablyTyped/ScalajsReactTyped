package typingsJapgolly.gherkin

import typingsJapgolly.gherkin.anon.DefaultDialect
import typingsJapgolly.gherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMakeGherkinOptionsMod {
  
  @JSImport("gherkin/dist/src/makeGherkinOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: IGherkinOptions): DefaultDialect = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[DefaultDialect]
}
