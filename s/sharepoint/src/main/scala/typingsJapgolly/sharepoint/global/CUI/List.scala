package typingsJapgolly.sharepoint.global.CUI

import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.List")
@js.native
open class List[T] ()
  extends StObject
     with typingsJapgolly.sharepoint.CUI.List[T] {
  
  /* CompleteClass */
  override def add(data: T): scala.Unit = js.native
  
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  
  /* CompleteClass */
  override def getEnumeratorAtPos(): typingsJapgolly.sharepoint.CUI.ListEnumerator[T] = js.native
  
  /* CompleteClass */
  override def get_count(): Double = js.native
  
  /* CompleteClass */
  override def get_item(index: Double): T = js.native
  
  /* CompleteClass */
  override def indexOf(data: T): Double = js.native
  
  /* CompleteClass */
  override def insert(index: Double, data: T): scala.Unit = js.native
  
  /* CompleteClass */
  override def remove(data: T): scala.Unit = js.native
}
