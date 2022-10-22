package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI control for the selection of views in a pane.
  *
  * Every tab of a tab bar has, besides its localized title and help text, the URL of a view. A possible alternative would be to use a command URL instead
  * of the view URL.
  *
  * In the current Impress implementation a tab bar is only used for the center pane to switch between views in the center pane. Tab bars can make sense
  * for other panes as well, i.e. for showing either the slide sorter or the outline view in the left pane.
  *
  * Tab bar buttons are identified by their resource id. Note that because the resource anchors are all the same (the tab bar), it is the resource URL
  * that really identifies a button. There can not be two buttons with the same resource id.
  *
  * A better place for this interface (in an extended version) would be `com::sun::star::awt`
  * @see TabBarButton
  */
trait XTabBar extends StObject {
  
  /**
    * Return a sequence of all the tab bar buttons.
    *
    * Their order reflects the visible order in the tab bar.
    *
    * This method can be used when {@link addTabBarButtonAfter()} does not provide enough control as to where to insert a new button.
    */
  val TabBarButtons: SafeArray[TabBarButton]
  
  /**
    * Add a tab bar button to the right of another one.
    * @param aButton The new tab bar button that is to be inserted. If a button with the same resource id is already present than that is removed before the n
    * @param aAnchor The new button is inserted to the right of this button. When its {@link ResourceId} is empty then the new button is inserted at the left
    */
  def addTabBarButtonAfter(aButton: TabBarButton, aAnchor: TabBarButton): Unit
  
  /**
    * Add a tab bar button at the right most position.
    * @param aButton The new tab bar button that is to be inserted.
    */
  def appendTabBarButton(aButton: TabBarButton): Unit
  
  /**
    * Return a sequence of all the tab bar buttons.
    *
    * Their order reflects the visible order in the tab bar.
    *
    * This method can be used when {@link addTabBarButtonAfter()} does not provide enough control as to where to insert a new button.
    */
  def getTabBarButtons(): SafeArray[TabBarButton]
  
  /**
    * Test whether the specified button exists in the tab bar.
    * @param aButton The tab bar button whose existence is tested.
    * @returns Returns `TRUE` when the button exists.
    */
  def hasTabBarButton(aButton: TabBarButton): Boolean
  
  /**
    * Remove a tab bar button.
    * @param aButton The tab bar button to remove. When there is no button with the specified resource id then this call is silently ignored.
    */
  def removeTabBarButton(aButton: TabBarButton): Unit
}
object XTabBar {
  
  inline def apply(
    TabBarButtons: SafeArray[TabBarButton],
    addTabBarButtonAfter: (TabBarButton, TabBarButton) => Callback,
    appendTabBarButton: TabBarButton => Callback,
    getTabBarButtons: CallbackTo[SafeArray[TabBarButton]],
    hasTabBarButton: TabBarButton => Boolean,
    removeTabBarButton: TabBarButton => Callback
  ): XTabBar = {
    val __obj = js.Dynamic.literal(TabBarButtons = TabBarButtons.asInstanceOf[js.Any], addTabBarButtonAfter = js.Any.fromFunction2((t0: TabBarButton, t1: TabBarButton) => (addTabBarButtonAfter(t0, t1)).runNow()), appendTabBarButton = js.Any.fromFunction1((t0: TabBarButton) => appendTabBarButton(t0).runNow()), getTabBarButtons = getTabBarButtons.toJsFn, hasTabBarButton = js.Any.fromFunction1(hasTabBarButton), removeTabBarButton = js.Any.fromFunction1((t0: TabBarButton) => removeTabBarButton(t0).runNow()))
    __obj.asInstanceOf[XTabBar]
  }
  
  extension [Self <: XTabBar](x: Self) {
    
    inline def setAddTabBarButtonAfter(value: (TabBarButton, TabBarButton) => Callback): Self = StObject.set(x, "addTabBarButtonAfter", js.Any.fromFunction2((t0: TabBarButton, t1: TabBarButton) => (value(t0, t1)).runNow()))
    
    inline def setAppendTabBarButton(value: TabBarButton => Callback): Self = StObject.set(x, "appendTabBarButton", js.Any.fromFunction1((t0: TabBarButton) => value(t0).runNow()))
    
    inline def setGetTabBarButtons(value: CallbackTo[SafeArray[TabBarButton]]): Self = StObject.set(x, "getTabBarButtons", value.toJsFn)
    
    inline def setHasTabBarButton(value: TabBarButton => Boolean): Self = StObject.set(x, "hasTabBarButton", js.Any.fromFunction1(value))
    
    inline def setRemoveTabBarButton(value: TabBarButton => Callback): Self = StObject.set(x, "removeTabBarButton", js.Any.fromFunction1((t0: TabBarButton) => value(t0).runNow()))
    
    inline def setTabBarButtons(value: SafeArray[TabBarButton]): Self = StObject.set(x, "TabBarButtons", value.asInstanceOf[js.Any])
  }
}
