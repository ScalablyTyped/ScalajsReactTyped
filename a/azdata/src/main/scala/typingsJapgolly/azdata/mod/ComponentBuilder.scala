package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBuilder[TComponent /* <: Component */, TPropertyBag /* <: ComponentProperties */] extends StObject {
  
  def component(): TComponent
  
  /**
    * @deprecated Use withProps instead
    */
  def withProperties(properties: TPropertyBag): ComponentBuilder[TComponent, TPropertyBag]
  
  /**
    * Sets the initial set of properties for the component being created
    * @param properties The properties to apply to the component
    */
  def withProps(properties: TPropertyBag): ComponentBuilder[TComponent, TPropertyBag]
  
  def withValidation(validation: js.Function1[/* component */ TComponent, Boolean | Thenable[Boolean]]): ComponentBuilder[TComponent, TPropertyBag]
}
object ComponentBuilder {
  
  inline def apply[TComponent /* <: Component */, TPropertyBag /* <: ComponentProperties */](
    component: CallbackTo[TComponent],
    withProperties: TPropertyBag => ComponentBuilder[TComponent, TPropertyBag],
    withProps: TPropertyBag => ComponentBuilder[TComponent, TPropertyBag],
    withValidation: js.Function1[/* component */ TComponent, Boolean | Thenable[Boolean]] => ComponentBuilder[TComponent, TPropertyBag]
  ): ComponentBuilder[TComponent, TPropertyBag] = {
    val __obj = js.Dynamic.literal(component = component.toJsFn, withProperties = js.Any.fromFunction1(withProperties), withProps = js.Any.fromFunction1(withProps), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[ComponentBuilder[TComponent, TPropertyBag]]
  }
  
  extension [Self <: ComponentBuilder[?, ?], TComponent /* <: Component */, TPropertyBag /* <: ComponentProperties */](x: Self & (ComponentBuilder[TComponent, TPropertyBag])) {
    
    inline def setComponent(value: CallbackTo[TComponent]): Self = StObject.set(x, "component", value.toJsFn)
    
    inline def setWithProperties(value: TPropertyBag => ComponentBuilder[TComponent, TPropertyBag]): Self = StObject.set(x, "withProperties", js.Any.fromFunction1(value))
    
    inline def setWithProps(value: TPropertyBag => ComponentBuilder[TComponent, TPropertyBag]): Self = StObject.set(x, "withProps", js.Any.fromFunction1(value))
    
    inline def setWithValidation(
      value: js.Function1[/* component */ TComponent, Boolean | Thenable[Boolean]] => ComponentBuilder[TComponent, TPropertyBag]
    ): Self = StObject.set(x, "withValidation", js.Any.fromFunction1(value))
  }
}
