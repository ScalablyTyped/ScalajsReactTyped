package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IFolderContentItem
import typingsJapgolly.mfiles.ILookup
import typingsJapgolly.mfiles.IObjectVersion
import typingsJapgolly.mfiles.ITypedValue
import typingsJapgolly.mfiles.IView
import typingsJapgolly.mfiles.MFiles.MFFolderContentItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderContentItem")
@js.native
open class FolderContentItem ()
  extends StObject
     with IFolderContentItem {
  
  /* CompleteClass */
  override val FolderContentItemType: MFFolderContentItemType = js.native
  
  /* CompleteClass */
  override val ObjectVersion: IObjectVersion = js.native
  
  /* CompleteClass */
  override val PropertyFolder: ITypedValue = js.native
  
  /* CompleteClass */
  override val TraditionalFolder: ILookup = js.native
  
  /* CompleteClass */
  override val View: IView = js.native
}
