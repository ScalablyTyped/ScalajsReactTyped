package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Set
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsTabsDotuniDotdriverMod {
  
  trait TabsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickTabAt(index: Double): js.Promise[Unit]
    
    def getActiveTabIndex(): js.Promise[Double]
    
    def getDataHook(): js.Promise[String]
    
    def getItemsContainerType(): js.Promise[String]
    
    def getItemsMaxWidths(): js.Promise[js.Array[String]]
    
    def getItemsWidth(): js.Promise[Set[String]]
    
    var getSideContent: js.Promise[js.Array[UniDriver[Any] | Null]]
    
    def getTitles(): js.Promise[js.Array[String]]
    
    def hasDivider(): js.Promise[Boolean]
    
    def isDefaultType(): js.Promise[Boolean]
  }
  object TabsUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickTabAt: Double => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getActiveTabIndex: CallbackTo[js.Promise[Double]],
      getDataHook: CallbackTo[js.Promise[String]],
      getItemsContainerType: CallbackTo[js.Promise[String]],
      getItemsMaxWidths: CallbackTo[js.Promise[js.Array[String]]],
      getItemsWidth: CallbackTo[js.Promise[Set[String]]],
      getSideContent: js.Promise[js.Array[UniDriver[Any] | Null]],
      getTitles: CallbackTo[js.Promise[js.Array[String]]],
      hasDivider: CallbackTo[js.Promise[Boolean]],
      isDefaultType: CallbackTo[js.Promise[Boolean]]
    ): TabsUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickTabAt = js.Any.fromFunction1(clickTabAt), element = element.toJsFn, exists = exists.toJsFn, getActiveTabIndex = getActiveTabIndex.toJsFn, getDataHook = getDataHook.toJsFn, getItemsContainerType = getItemsContainerType.toJsFn, getItemsMaxWidths = getItemsMaxWidths.toJsFn, getItemsWidth = getItemsWidth.toJsFn, getSideContent = getSideContent.asInstanceOf[js.Any], getTitles = getTitles.toJsFn, hasDivider = hasDivider.toJsFn, isDefaultType = isDefaultType.toJsFn)
      __obj.asInstanceOf[TabsUniDriver]
    }
    
    extension [Self <: TabsUniDriver](x: Self) {
      
      inline def setClickTabAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickTabAt", js.Any.fromFunction1(value))
      
      inline def setGetActiveTabIndex(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getActiveTabIndex", value.toJsFn)
      
      inline def setGetDataHook(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDataHook", value.toJsFn)
      
      inline def setGetItemsContainerType(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getItemsContainerType", value.toJsFn)
      
      inline def setGetItemsMaxWidths(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "getItemsMaxWidths", value.toJsFn)
      
      inline def setGetItemsWidth(value: CallbackTo[js.Promise[Set[String]]]): Self = StObject.set(x, "getItemsWidth", value.toJsFn)
      
      inline def setGetSideContent(value: js.Promise[js.Array[UniDriver[Any] | Null]]): Self = StObject.set(x, "getSideContent", value.asInstanceOf[js.Any])
      
      inline def setGetTitles(value: CallbackTo[js.Promise[js.Array[String]]]): Self = StObject.set(x, "getTitles", value.toJsFn)
      
      inline def setHasDivider(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasDivider", value.toJsFn)
      
      inline def setIsDefaultType(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDefaultType", value.toJsFn)
    }
  }
}
