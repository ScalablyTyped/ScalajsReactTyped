package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelAnalyticsAnalyticalTreeBindingAdapterMod {
  
  @JSImport("sap/ui/model/analytics/AnalyticalTreeBindingAdapter", JSImport.Default)
  @js.native
  /**
    * Adapter for TreeBindings to add the ListBinding functionality and use the tree structure in list based
    * controls.
    */
  open class default ()
    extends StObject
       with AnalyticalTreeBindingAdapter {
    
    /**
      * Retrieves the currently set number of expanded levels from the Binding (commonly an AnalyticalBinding).
      *
      * @returns the number of expanded levels
      */
    /* CompleteClass */
    override def getNumberOfExpandedLevels(): int = js.native
    
    /**
      * Checks if the AnalyticalBinding has totaled measures available. Used for rendering sum rows.
      *
      * @returns Whether the binding has totaled measures or not
      */
    /* CompleteClass */
    override def hasTotaledMeasures(): Boolean = js.native
    
    /**
      * Sets the number of expanded levels on the TreeBinding (commonly an AnalyticalBinding). This is NOT the
      * same as AnalyticalTreeBindingAdapter#collapse or AnalyticalTreeBindingAdapter#expand. Setting the number
      * of expanded levels leads to different requests. This function is used by the AnalyticalTable for the
      * ungroup/ungroup-all feature.
      */
    /* CompleteClass */
    override def setNumberOfExpandedLevels(/**
      * the number of levels which should be expanded, minimum is 0
      */
    iLevels: int): Unit = js.native
  }
  
  trait AnalyticalTreeBindingAdapter extends StObject {
    
    /**
      * Retrieves the currently set number of expanded levels from the Binding (commonly an AnalyticalBinding).
      *
      * @returns the number of expanded levels
      */
    def getNumberOfExpandedLevels(): int
    
    /**
      * Checks if the AnalyticalBinding has totaled measures available. Used for rendering sum rows.
      *
      * @returns Whether the binding has totaled measures or not
      */
    def hasTotaledMeasures(): Boolean
    
    /**
      * Sets the number of expanded levels on the TreeBinding (commonly an AnalyticalBinding). This is NOT the
      * same as AnalyticalTreeBindingAdapter#collapse or AnalyticalTreeBindingAdapter#expand. Setting the number
      * of expanded levels leads to different requests. This function is used by the AnalyticalTable for the
      * ungroup/ungroup-all feature.
      */
    def setNumberOfExpandedLevels(/**
      * the number of levels which should be expanded, minimum is 0
      */
    iLevels: int): Unit
  }
  object AnalyticalTreeBindingAdapter {
    
    inline def apply(
      getNumberOfExpandedLevels: CallbackTo[int],
      hasTotaledMeasures: CallbackTo[Boolean],
      setNumberOfExpandedLevels: int => Callback
    ): AnalyticalTreeBindingAdapter = {
      val __obj = js.Dynamic.literal(getNumberOfExpandedLevels = getNumberOfExpandedLevels.toJsFn, hasTotaledMeasures = hasTotaledMeasures.toJsFn, setNumberOfExpandedLevels = js.Any.fromFunction1((t0: int) => setNumberOfExpandedLevels(t0).runNow()))
      __obj.asInstanceOf[AnalyticalTreeBindingAdapter]
    }
    
    extension [Self <: AnalyticalTreeBindingAdapter](x: Self) {
      
      inline def setGetNumberOfExpandedLevels(value: CallbackTo[int]): Self = StObject.set(x, "getNumberOfExpandedLevels", value.toJsFn)
      
      inline def setHasTotaledMeasures(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTotaledMeasures", value.toJsFn)
      
      inline def setSetNumberOfExpandedLevels(value: int => Callback): Self = StObject.set(x, "setNumberOfExpandedLevels", js.Any.fromFunction1((t0: int) => value(t0).runNow()))
    }
  }
}
