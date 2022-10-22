package typingsJapgolly.hastUtilParseSelector

import typingsJapgolly.hastUtilParseSelector.anon.TagName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-parse-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](): typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")().asInstanceOf[typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](selector: Selector): typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](selector: Selector, defaultTagName: DefaultTagName): typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any], defaultTagName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](selector: Unit, defaultTagName: DefaultTagName): typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any], defaultTagName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  
  type Element = typingsJapgolly.hast.mod.Element
  
  type Properties = typingsJapgolly.hast.mod.Properties
}
