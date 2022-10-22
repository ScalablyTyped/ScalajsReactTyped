package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFilter[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] extends StObject {
  
  /**
    * Custom filter parameters to be passed to the generator function
    */
  var customFilterParameters: CustomFilterParameters[FParams]
  
  /**
    * Function to generate the filter component
    */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): Element
  
  /**
    * Type must be 'CustomFilter'
    */
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
}
object CustomFilter {
  
  inline def apply[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ], CustomFilterParameters[FParams]) => Element
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters.asInstanceOf[js.Any], getElement = js.Any.fromFunction2(getElement))
    __obj.updateDynamic("type")("CustomFilter")
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
  
  extension [Self <: CustomFilter[?, ?], FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](x: Self & (CustomFilter[FParams, FElement])) {
    
    inline def setCustomFilterParameters(value: CustomFilterParameters[FParams]): Self = StObject.set(x, "customFilterParameters", value.asInstanceOf[js.Any])
    
    inline def setGetElement(
      value: (js.Function2[
          /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
          /* type */ js.UndefOr[typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
          Unit
        ], CustomFilterParameters[FParams]) => Element
    ): Self = StObject.set(x, "getElement", js.Any.fromFunction2(value))
    
    inline def setType(value: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
