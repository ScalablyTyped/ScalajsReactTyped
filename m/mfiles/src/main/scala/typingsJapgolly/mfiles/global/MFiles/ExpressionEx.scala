package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IExpression
import typingsJapgolly.mfiles.IExpressionEx
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.MFiles.MFFolderListingAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ExpressionEx")
@js.native
open class ExpressionEx ()
  extends StObject
     with IExpressionEx {
  
  /* CompleteClass */
  override def Clone(): IExpressionEx = js.native
  
  /* CompleteClass */
  var Conditions: ISearchConditions = js.native
  
  /* CompleteClass */
  var Expression: IExpression = js.native
  
  /* CompleteClass */
  var FolderListingAlgorithm: MFFolderListingAlgorithm = js.native
  
  /* CompleteClass */
  var NULLFolderName: String = js.native
  
  /* CompleteClass */
  var ShowContentsAsJITFolders: Boolean = js.native
  
  /* CompleteClass */
  var ShowEmptyFolders: Boolean = js.native
  
  /* CompleteClass */
  var ShowMatchingObjectsOnThisLevel: Boolean = js.native
  
  /* CompleteClass */
  var ShowNULLFolder: Boolean = js.native
  
  /* CompleteClass */
  var ShowNULLFolderContentsOnThisLevel: Boolean = js.native
}
