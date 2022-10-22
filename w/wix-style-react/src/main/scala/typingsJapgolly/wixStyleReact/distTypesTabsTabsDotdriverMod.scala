package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Set
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsTabsDotdriverMod {
  
  trait TabsDriver
    extends StObject
       with BaseDriver {
    
    def clickTabAt(index: Double): Unit
    
    def getActiveTabIndex(): Double
    
    def getDataHook(): String
    
    def getItemsContainerType(): String
    
    def getItemsMaxWidths(): js.Array[String]
    
    def getItemsWidth(): Set[String]
    
    var getSideContent: js.Array[UniDriver[Any] | Null]
    
    def getTitles(): js.Array[String]
    
    def hasDivider(): Boolean
    
    def isDefaultType(): Boolean
  }
  object TabsDriver {
    
    inline def apply(
      clickTabAt: Double => Callback,
      exists: CallbackTo[Boolean],
      getActiveTabIndex: CallbackTo[Double],
      getDataHook: CallbackTo[String],
      getItemsContainerType: CallbackTo[String],
      getItemsMaxWidths: CallbackTo[js.Array[String]],
      getItemsWidth: CallbackTo[Set[String]],
      getSideContent: js.Array[UniDriver[Any] | Null],
      getTitles: CallbackTo[js.Array[String]],
      hasDivider: CallbackTo[Boolean],
      isDefaultType: CallbackTo[Boolean]
    ): TabsDriver = {
      val __obj = js.Dynamic.literal(clickTabAt = js.Any.fromFunction1((t0: Double) => clickTabAt(t0).runNow()), exists = exists.toJsFn, getActiveTabIndex = getActiveTabIndex.toJsFn, getDataHook = getDataHook.toJsFn, getItemsContainerType = getItemsContainerType.toJsFn, getItemsMaxWidths = getItemsMaxWidths.toJsFn, getItemsWidth = getItemsWidth.toJsFn, getSideContent = getSideContent.asInstanceOf[js.Any], getTitles = getTitles.toJsFn, hasDivider = hasDivider.toJsFn, isDefaultType = isDefaultType.toJsFn)
      __obj.asInstanceOf[TabsDriver]
    }
    
    extension [Self <: TabsDriver](x: Self) {
      
      inline def setClickTabAt(value: Double => Callback): Self = StObject.set(x, "clickTabAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setGetActiveTabIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getActiveTabIndex", value.toJsFn)
      
      inline def setGetDataHook(value: CallbackTo[String]): Self = StObject.set(x, "getDataHook", value.toJsFn)
      
      inline def setGetItemsContainerType(value: CallbackTo[String]): Self = StObject.set(x, "getItemsContainerType", value.toJsFn)
      
      inline def setGetItemsMaxWidths(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getItemsMaxWidths", value.toJsFn)
      
      inline def setGetItemsWidth(value: CallbackTo[Set[String]]): Self = StObject.set(x, "getItemsWidth", value.toJsFn)
      
      inline def setGetSideContent(value: js.Array[UniDriver[Any] | Null]): Self = StObject.set(x, "getSideContent", value.asInstanceOf[js.Any])
      
      inline def setGetSideContentVarargs(value: (UniDriver[Any] | Null)*): Self = StObject.set(x, "getSideContent", js.Array(value*))
      
      inline def setGetTitles(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getTitles", value.toJsFn)
      
      inline def setHasDivider(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasDivider", value.toJsFn)
      
      inline def setIsDefaultType(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultType", value.toJsFn)
    }
  }
}
