package typingsJapgolly.mobservableReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ClassicComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobservable-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observer[P](clazz: ComponentClassP[P & js.Object]): ComponentClassP[P & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(clazz.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & js.Object]]
  inline def observer[P](
    clazz: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any
  ): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(clazz.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  inline def observer[P](clazz: ClassicComponentClass[P]): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(clazz.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  inline def observer[P](renderFunction: js.Function1[/* props */ P, Element]): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(renderFunction.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  
  inline def observer_TFunction_TFunction[TFunction /* <: ComponentClassP[Any & js.Object] */](target: TFunction): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(target.asInstanceOf[js.Any]).asInstanceOf[TFunction]
}
