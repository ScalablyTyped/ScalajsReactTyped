package typingsJapgolly.chaiEnzyme

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.enzyme.mod.ShallowWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ChaiPlugin]
  inline def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply(wrapper.asInstanceOf[js.Any]).asInstanceOf[ChaiPlugin]
  
  @JSImport("chai-enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DebugWrapper = (ShallowWrapper[Any, Any, Component[js.Object, js.Object]]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Cheerio */ Any) | (ReactWrapper[Any, Any, Component[js.Object, js.Object]])
}
