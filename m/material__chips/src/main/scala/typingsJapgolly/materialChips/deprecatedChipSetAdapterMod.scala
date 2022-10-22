package typingsJapgolly.materialChips

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedChipSetAdapterMod {
  
  trait MDCChipSetAdapter extends StObject {
    
    /**
      * Announces the message via an aria-live region.
      */
    def announceMessage(message: String): Unit
    
    /**
      * Calls Chip#focusPrimaryAction() on the chip at the given index.
      * @param index the index of the chip
      */
    def focusChipPrimaryActionAtIndex(index: Double): Unit
    
    /**
      * Calls Chip#focusTrailingAction() on the chip at the given index.
      * @param index the index of the chip
      */
    def focusChipTrailingActionAtIndex(index: Double): Unit
    
    /**
      * @return the number of chips in the chip set.
      */
    def getChipListCount(): Double
    
    /**
      * Returns the index of the chip at the given ID.
      * @param chipId the unique ID of the chip
      * @return the numerical index of the chip with the matching id or -1.
      */
    def getIndexOfChipById(chipId: String): Double
    
    /**
      * @return true if the root element contains the given class name.
      */
    def hasClass(className: String): Boolean
    
    /**
      * @return true if the text direction is RTL.
      */
    def isRTL(): Boolean
    
    /**
      * Removes the chip with the given index from the chip set.
      * Make sure to remove it from the chip list, too.
      */
    def removeChipAtIndex(index: Double): Unit
    
    /**
      * Removes focus from the chip at the given index.
      * @param index the index of the chip
      */
    def removeFocusFromChipAtIndex(index: Double): Unit
    
    /**
      * Sets the selected state of the chip at the given index.
      */
    def selectChipAtIndex(index: Double, isSelected: Boolean, shouldNotifyClients: Boolean): Unit
  }
  object MDCChipSetAdapter {
    
    inline def apply(
      announceMessage: String => Callback,
      focusChipPrimaryActionAtIndex: Double => Callback,
      focusChipTrailingActionAtIndex: Double => Callback,
      getChipListCount: CallbackTo[Double],
      getIndexOfChipById: String => Double,
      hasClass: String => Boolean,
      isRTL: CallbackTo[Boolean],
      removeChipAtIndex: Double => Callback,
      removeFocusFromChipAtIndex: Double => Callback,
      selectChipAtIndex: (Double, Boolean, Boolean) => Callback
    ): MDCChipSetAdapter = {
      val __obj = js.Dynamic.literal(announceMessage = js.Any.fromFunction1((t0: String) => announceMessage(t0).runNow()), focusChipPrimaryActionAtIndex = js.Any.fromFunction1((t0: Double) => focusChipPrimaryActionAtIndex(t0).runNow()), focusChipTrailingActionAtIndex = js.Any.fromFunction1((t0: Double) => focusChipTrailingActionAtIndex(t0).runNow()), getChipListCount = getChipListCount.toJsFn, getIndexOfChipById = js.Any.fromFunction1(getIndexOfChipById), hasClass = js.Any.fromFunction1(hasClass), isRTL = isRTL.toJsFn, removeChipAtIndex = js.Any.fromFunction1((t0: Double) => removeChipAtIndex(t0).runNow()), removeFocusFromChipAtIndex = js.Any.fromFunction1((t0: Double) => removeFocusFromChipAtIndex(t0).runNow()), selectChipAtIndex = js.Any.fromFunction3((t0: Double, t1: Boolean, t2: Boolean) => (selectChipAtIndex(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[MDCChipSetAdapter]
    }
    
    extension [Self <: MDCChipSetAdapter](x: Self) {
      
      inline def setAnnounceMessage(value: String => Callback): Self = StObject.set(x, "announceMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setFocusChipPrimaryActionAtIndex(value: Double => Callback): Self = StObject.set(x, "focusChipPrimaryActionAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setFocusChipTrailingActionAtIndex(value: Double => Callback): Self = StObject.set(x, "focusChipTrailingActionAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setGetChipListCount(value: CallbackTo[Double]): Self = StObject.set(x, "getChipListCount", value.toJsFn)
      
      inline def setGetIndexOfChipById(value: String => Double): Self = StObject.set(x, "getIndexOfChipById", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRTL", value.toJsFn)
      
      inline def setRemoveChipAtIndex(value: Double => Callback): Self = StObject.set(x, "removeChipAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setRemoveFocusFromChipAtIndex(value: Double => Callback): Self = StObject.set(x, "removeFocusFromChipAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSelectChipAtIndex(value: (Double, Boolean, Boolean) => Callback): Self = StObject.set(x, "selectChipAtIndex", js.Any.fromFunction3((t0: Double, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    }
  }
}
