package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewLocation extends StObject {
  
  def Clone(): IViewLocation
  
  var OverlappedFolder: ITypedValue
  
  var Overlapping: Boolean
  
  var ParentFolder: IFolderDefs
}
object IViewLocation {
  
  inline def apply(
    Clone: CallbackTo[IViewLocation],
    OverlappedFolder: ITypedValue,
    Overlapping: Boolean,
    ParentFolder: IFolderDefs
  ): IViewLocation = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, OverlappedFolder = OverlappedFolder.asInstanceOf[js.Any], Overlapping = Overlapping.asInstanceOf[js.Any], ParentFolder = ParentFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewLocation]
  }
  
  extension [Self <: IViewLocation](x: Self) {
    
    inline def setClone(value: CallbackTo[IViewLocation]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setOverlappedFolder(value: ITypedValue): Self = StObject.set(x, "OverlappedFolder", value.asInstanceOf[js.Any])
    
    inline def setOverlapping(value: Boolean): Self = StObject.set(x, "Overlapping", value.asInstanceOf[js.Any])
    
    inline def setParentFolder(value: IFolderDefs): Self = StObject.set(x, "ParentFolder", value.asInstanceOf[js.Any])
  }
}
