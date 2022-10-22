package typingsJapgolly.materialGridList

import typingsJapgolly.materialGridList.materialGridListStrings.length
import typingsJapgolly.materialGridList.materialGridListStrings.parentRule
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCGridListAdapter extends StObject {
    
    def deregisterResizeHandler(handler: EventListener): Unit = js.native
    
    def getNumberOfTiles(): Double = js.native
    
    def getOffsetWidth(): Double = js.native
    
    def getOffsetWidthForTileAtIndex(index: Double): Double = js.native
    
    def registerResizeHandler(handler: EventListener): Unit = js.native
    
    def setStyleForTilesElement(
      property: Exclude[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 458, starting with typingsJapgolly.materialGridList.materialGridListStrings.accentColor, typingsJapgolly.materialGridList.materialGridListStrings.alignContent, typingsJapgolly.materialGridList.materialGridListStrings.alignItems */ Any, 
          length | parentRule
        ]
    ): Unit = js.native
    def setStyleForTilesElement(
      property: Exclude[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 458, starting with typingsJapgolly.materialGridList.materialGridListStrings.accentColor, typingsJapgolly.materialGridList.materialGridListStrings.alignContent, typingsJapgolly.materialGridList.materialGridListStrings.alignItems */ Any, 
          length | parentRule
        ],
      value: String
    ): Unit = js.native
  }
}
