package typingsJapgolly.xrm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.App.PaneObject
import typingsJapgolly.xrm.Xrm.App.PaneOptions
import typingsJapgolly.xrm.Xrm.Async.PromiseLike
import typingsJapgolly.xrm.XrmEnum.StageCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CreatePane extends StObject {
    
    /**
      * Provides all the information to create side panes.
      * @param paneOptions The ID to use to clear a specific notification that was set using addGlobalNotification.
      */
    def createPane(): PromiseLike[PaneObject] = js.native
    def createPane(paneOptions: PaneOptions): PromiseLike[PaneObject] = js.native
    
    /**
      * @returns a collection containing all active panes.
      */
    def getAllPanes(): js.Array[PaneObject] = js.native
    
    /**
      * @param panelId string
      * @returns the side pane corresponding to the input ID. If the side pane does not exist, undefined is returned.
      */
    def getPane(panelId: String): js.UndefOr[PaneObject] = js.native
    
    /**
      * @returns the currently selected pane.
      */
    def getSelectedPane(): PaneObject = js.native
    
    /**
      * @returns whether the selected pane is collapsed or expanded.
      */
    var state: Double = js.native
  }
  
  trait GetValue extends StObject {
    
    def getValue(): StageCategory
  }
  object GetValue {
    
    inline def apply(getValue: CallbackTo[StageCategory]): GetValue = {
      val __obj = js.Dynamic.literal(getValue = getValue.toJsFn)
      __obj.asInstanceOf[GetValue]
    }
    
    extension [Self <: GetValue](x: Self) {
      
      inline def setGetValue(value: CallbackTo[StageCategory]): Self = StObject.set(x, "getValue", value.toJsFn)
    }
  }
}
