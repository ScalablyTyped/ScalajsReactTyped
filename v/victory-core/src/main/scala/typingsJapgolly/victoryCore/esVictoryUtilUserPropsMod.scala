package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilUserPropsMod {
  
  @JSImport("victory-core/es/victory-util/user-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSafeUserProps[T](props: T): Record[SafeAttribute, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafeUserProps")(props.asInstanceOf[js.Any]).asInstanceOf[Record[SafeAttribute, String]]
  
  inline def withSafeUserProps(component: Element, props: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeUserProps")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type SafeAttribute = String
}
