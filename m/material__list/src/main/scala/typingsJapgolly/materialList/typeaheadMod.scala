package typingsJapgolly.materialList

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.materialList.typesMod.MDCListTextAndIndex
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeaheadMod {
  
  @JSImport("@material/list/typeahead", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearBuffer(state: TypeaheadState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearBuffer")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleKeydown(opts: HandleKeydownOpts, state: TypeaheadState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("handleKeydown")(opts.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def initSortedIndex(listItemCount: Double, getPrimaryTextByItemIndex: js.Function1[/* index */ Double, String]): Map[String, js.Array[MDCListTextAndIndex]] = (^.asInstanceOf[js.Dynamic].applyDynamic("initSortedIndex")(listItemCount.asInstanceOf[js.Any], getPrimaryTextByItemIndex.asInstanceOf[js.Any])).asInstanceOf[Map[String, js.Array[MDCListTextAndIndex]]]
  
  inline def initState(): TypeaheadState = ^.asInstanceOf[js.Dynamic].applyDynamic("initState")().asInstanceOf[TypeaheadState]
  
  inline def isTypingInProgress(state: TypeaheadState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypingInProgress")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchItem(opts: TypeaheadMatchItemOpts, state: TypeaheadState): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("matchItem")(opts.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait HandleKeydownOpts extends StObject {
    
    var event: KeyboardEvent
    
    def focusItemAtIndex(index: Double): Unit
    
    var focusedItemIndex: Double
    
    def isItemAtIndexDisabled(index: Double): Boolean
    
    var isTargetListItem: Boolean
    
    var sortedIndexByFirstChar: Map[String, js.Array[MDCListTextAndIndex]]
  }
  object HandleKeydownOpts {
    
    inline def apply(
      event: KeyboardEvent,
      focusItemAtIndex: Double => Callback,
      focusedItemIndex: Double,
      isItemAtIndexDisabled: Double => Boolean,
      isTargetListItem: Boolean,
      sortedIndexByFirstChar: Map[String, js.Array[MDCListTextAndIndex]]
    ): HandleKeydownOpts = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], focusItemAtIndex = js.Any.fromFunction1((t0: Double) => focusItemAtIndex(t0).runNow()), focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any], isItemAtIndexDisabled = js.Any.fromFunction1(isItemAtIndexDisabled), isTargetListItem = isTargetListItem.asInstanceOf[js.Any], sortedIndexByFirstChar = sortedIndexByFirstChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleKeydownOpts]
    }
    
    extension [Self <: HandleKeydownOpts](x: Self) {
      
      inline def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFocusItemAtIndex(value: Double => Callback): Self = StObject.set(x, "focusItemAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setFocusedItemIndex(value: Double): Self = StObject.set(x, "focusedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setIsItemAtIndexDisabled(value: Double => Boolean): Self = StObject.set(x, "isItemAtIndexDisabled", js.Any.fromFunction1(value))
      
      inline def setIsTargetListItem(value: Boolean): Self = StObject.set(x, "isTargetListItem", value.asInstanceOf[js.Any])
      
      inline def setSortedIndexByFirstChar(value: Map[String, js.Array[MDCListTextAndIndex]]): Self = StObject.set(x, "sortedIndexByFirstChar", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeaheadMatchItemOpts extends StObject {
    
    def focusItemAtIndex(index: Double): Unit
    
    var focusedItemIndex: Double
    
    def isItemAtIndexDisabled(index: Double): Boolean
    
    var nextChar: String
    
    var skipFocus: Boolean
    
    var sortedIndexByFirstChar: Map[String, js.Array[MDCListTextAndIndex]]
  }
  object TypeaheadMatchItemOpts {
    
    inline def apply(
      focusItemAtIndex: Double => Callback,
      focusedItemIndex: Double,
      isItemAtIndexDisabled: Double => Boolean,
      nextChar: String,
      skipFocus: Boolean,
      sortedIndexByFirstChar: Map[String, js.Array[MDCListTextAndIndex]]
    ): TypeaheadMatchItemOpts = {
      val __obj = js.Dynamic.literal(focusItemAtIndex = js.Any.fromFunction1((t0: Double) => focusItemAtIndex(t0).runNow()), focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any], isItemAtIndexDisabled = js.Any.fromFunction1(isItemAtIndexDisabled), nextChar = nextChar.asInstanceOf[js.Any], skipFocus = skipFocus.asInstanceOf[js.Any], sortedIndexByFirstChar = sortedIndexByFirstChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeaheadMatchItemOpts]
    }
    
    extension [Self <: TypeaheadMatchItemOpts](x: Self) {
      
      inline def setFocusItemAtIndex(value: Double => Callback): Self = StObject.set(x, "focusItemAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setFocusedItemIndex(value: Double): Self = StObject.set(x, "focusedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setIsItemAtIndexDisabled(value: Double => Boolean): Self = StObject.set(x, "isItemAtIndexDisabled", js.Any.fromFunction1(value))
      
      inline def setNextChar(value: String): Self = StObject.set(x, "nextChar", value.asInstanceOf[js.Any])
      
      inline def setSkipFocus(value: Boolean): Self = StObject.set(x, "skipFocus", value.asInstanceOf[js.Any])
      
      inline def setSortedIndexByFirstChar(value: Map[String, js.Array[MDCListTextAndIndex]]): Self = StObject.set(x, "sortedIndexByFirstChar", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeaheadState extends StObject {
    
    var bufferClearTimeout: Double
    
    var currentFirstChar: String
    
    var sortedIndexCursor: Double
    
    var typeaheadBuffer: String
  }
  object TypeaheadState {
    
    inline def apply(
      bufferClearTimeout: Double,
      currentFirstChar: String,
      sortedIndexCursor: Double,
      typeaheadBuffer: String
    ): TypeaheadState = {
      val __obj = js.Dynamic.literal(bufferClearTimeout = bufferClearTimeout.asInstanceOf[js.Any], currentFirstChar = currentFirstChar.asInstanceOf[js.Any], sortedIndexCursor = sortedIndexCursor.asInstanceOf[js.Any], typeaheadBuffer = typeaheadBuffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeaheadState]
    }
    
    extension [Self <: TypeaheadState](x: Self) {
      
      inline def setBufferClearTimeout(value: Double): Self = StObject.set(x, "bufferClearTimeout", value.asInstanceOf[js.Any])
      
      inline def setCurrentFirstChar(value: String): Self = StObject.set(x, "currentFirstChar", value.asInstanceOf[js.Any])
      
      inline def setSortedIndexCursor(value: Double): Self = StObject.set(x, "sortedIndexCursor", value.asInstanceOf[js.Any])
      
      inline def setTypeaheadBuffer(value: String): Self = StObject.set(x, "typeaheadBuffer", value.asInstanceOf[js.Any])
    }
  }
}
