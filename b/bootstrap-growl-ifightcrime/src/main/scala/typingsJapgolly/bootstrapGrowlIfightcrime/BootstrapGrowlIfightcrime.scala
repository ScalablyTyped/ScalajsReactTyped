package typingsJapgolly.bootstrapGrowlIfightcrime

import typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapGrowlIfightcrime {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.info
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.danger
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.success
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.warning
    - java.lang.String
    - scala.Null
  */
  type AlertType = _AlertType | String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.left
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.center
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.right
  */
  trait AlignType extends StObject
  object AlignType {
    
    inline def center: typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.center = "center".asInstanceOf[typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.center]
    
    inline def left: typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.left = "left".asInstanceOf[typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.left]
    
    inline def right: typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.right = "right".asInstanceOf[typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.right]
  }
  
  trait OffsetOption extends StObject {
    
    /**
      * Offset amount
      */
    var amount: js.UndefOr[Double] = js.undefined
    
    /**
      * Position: top or bottom
      */
    var from: js.UndefOr[OffsetPositionType] = js.undefined
  }
  object OffsetOption {
    
    inline def apply(): OffsetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffsetOption]
    }
    
    extension [Self <: OffsetOption](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setFrom(value: OffsetPositionType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.top
    - typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.bottom
  */
  trait OffsetPositionType extends StObject
  object OffsetPositionType {
    
    inline def bottom: typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.bottom]
    
    inline def top: typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.top = "top".asInstanceOf[typingsJapgolly.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.top]
  }
  
  trait Options extends StObject {
    
    /**
      * 'left', 'right', or 'center'
      */
    var align: js.UndefOr[AlignType] = js.undefined
    
    /**
      *  If true then will display a cross to close the popup.
      */
    var allow_dismiss: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time while the message will be displayed. It's not equivalent to the *demo* timeOut!
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Which element to append to
      */
    var ele: js.UndefOr[String] = js.undefined
    
    /**
      * Offset Options
      */
    var offset: js.UndefOr[OffsetOption] = js.undefined
    
    /**
      * Spacing between consecutively stacked growls.
      */
    var stackup_spacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Values of (null, 'info', 'danger', 'success', 'warning') or another value
      */
    var `type`: js.UndefOr[AlertType] = js.undefined
    
    /**
      * Integer or 'auto'
      */
    var width: js.UndefOr[Double | auto] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllow_dismiss(value: Boolean): Self = StObject.set(x, "allow_dismiss", value.asInstanceOf[js.Any])
      
      inline def setAllow_dismissUndefined: Self = StObject.set(x, "allow_dismiss", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEle(value: String): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
      
      inline def setEleUndefined: Self = StObject.set(x, "ele", js.undefined)
      
      inline def setOffset(value: OffsetOption): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setStackup_spacing(value: Double): Self = StObject.set(x, "stackup_spacing", value.asInstanceOf[js.Any])
      
      inline def setStackup_spacingUndefined: Self = StObject.set(x, "stackup_spacing", js.undefined)
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait _AlertType extends StObject
}
