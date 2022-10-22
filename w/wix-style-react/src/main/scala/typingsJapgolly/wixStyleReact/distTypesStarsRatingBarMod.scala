package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStarsRatingBarMod {
  
  @JSImport("wix-style-react/dist/types/StarsRatingBar", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StarsRatingBarProps, js.Object, Any]
  
  type StarsRatingBar = PureComponent[StarsRatingBarProps, js.Object, Any]
  
  trait StarsRatingBarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var descriptionValues: js.UndefOr[js.Tuple5[String, String, String, String, String]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* rate */ Double, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[starRatingBarSize] = js.undefined
    
    var value: starRatingBarValue
  }
  object StarsRatingBarProps {
    
    inline def apply(value: starRatingBarValue): StarsRatingBarProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StarsRatingBarProps]
    }
    
    extension [Self <: StarsRatingBarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescriptionValues(value: js.Tuple5[String, String, String, String, String]): Self = StObject.set(x, "descriptionValues", value.asInstanceOf[js.Any])
      
      inline def setDescriptionValuesUndefined: Self = StObject.set(x, "descriptionValues", js.undefined)
      
      inline def setOnChange(value: /* rate */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* rate */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: starRatingBarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: starRatingBarValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait starRatingBarSize extends StObject
  object starRatingBarSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactInts.`0`
    - typingsJapgolly.wixStyleReact.wixStyleReactInts.`1`
    - typingsJapgolly.wixStyleReact.wixStyleReactInts.`2`
    - typingsJapgolly.wixStyleReact.wixStyleReactInts.`3`
    - typingsJapgolly.wixStyleReact.wixStyleReactInts.`4`
    - typingsJapgolly.wixStyleReact.wixStyleReactInts.`5`
  */
  trait starRatingBarValue extends StObject
  object starRatingBarValue {
    
    inline def `0`: typingsJapgolly.wixStyleReact.wixStyleReactInts.`0` = 0.asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactInts.`0`]
    
    inline def `1`: typingsJapgolly.wixStyleReact.wixStyleReactInts.`1` = 1.asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactInts.`1`]
    
    inline def `2`: typingsJapgolly.wixStyleReact.wixStyleReactInts.`2` = 2.asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactInts.`2`]
    
    inline def `3`: typingsJapgolly.wixStyleReact.wixStyleReactInts.`3` = 3.asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactInts.`3`]
    
    inline def `4`: typingsJapgolly.wixStyleReact.wixStyleReactInts.`4` = 4.asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactInts.`4`]
    
    inline def `5`: typingsJapgolly.wixStyleReact.wixStyleReactInts.`5` = 5.asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactInts.`5`]
  }
}
