package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IValueListItem
import typingsJapgolly.mfiles.IValueListItemSearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ValueListItemSearchResults")
@js.native
open class ValueListItemSearchResults ()
  extends StObject
     with IValueListItemSearchResults {
  
  /* CompleteClass */
  override def Add(Index: Double, ValueListItem: IValueListItem): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IValueListItemSearchResults = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IValueListItem = js.native
  
  /* CompleteClass */
  var MoreResults: Boolean = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
