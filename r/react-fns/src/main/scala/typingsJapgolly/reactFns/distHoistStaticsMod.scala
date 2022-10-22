package typingsJapgolly.reactFns

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHoistStaticsMod {
  
  @JSImport("react-fns/dist/hoistStatics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hoistNonReactStatics[P](targetComponent: ComponentClassP[P & js.Object], sourceComponent: ComponentClassP[Any & js.Object]): ComponentClassP[P & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistNonReactStatics")(targetComponent.asInstanceOf[js.Any], sourceComponent.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[P & js.Object]]
  inline def hoistNonReactStatics[P](
    targetComponent: ComponentClassP[P & js.Object],
    sourceComponent: ComponentClassP[Any & js.Object],
    blacklist: StringDictionary[Boolean]
  ): ComponentClassP[P & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistNonReactStatics")(targetComponent.asInstanceOf[js.Any], sourceComponent.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[P & js.Object]]
  
  inline def isEmptyChildren(children: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
