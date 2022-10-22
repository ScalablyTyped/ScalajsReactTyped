package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IFolderDefs
import typingsJapgolly.mfiles.ITypedValue
import typingsJapgolly.mfiles.IViewLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ViewLocation")
@js.native
open class ViewLocation ()
  extends StObject
     with IViewLocation {
  
  /* CompleteClass */
  override def Clone(): IViewLocation = js.native
  
  /* CompleteClass */
  var OverlappedFolder: ITypedValue = js.native
  
  /* CompleteClass */
  var Overlapping: Boolean = js.native
  
  /* CompleteClass */
  var ParentFolder: IFolderDefs = js.native
}
