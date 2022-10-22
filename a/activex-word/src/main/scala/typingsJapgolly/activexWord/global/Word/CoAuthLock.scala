package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdLockType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.CoAuthLock")
@js.native
/* private */ open class CoAuthLock ()
  extends StObject
     with typingsJapgolly.activexWord.Word.CoAuthLock {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val HeaderFooter: Boolean = js.native
  
  /* CompleteClass */
  override val Owner: typingsJapgolly.activexWord.Word.CoAuthor = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Range: typingsJapgolly.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val Type: WdLockType = js.native
  
  /* CompleteClass */
  override def Unlock(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.CoAuthLock_typekey")
  var WordDotCoAuthLock_typekey: typingsJapgolly.activexWord.Word.CoAuthLock = js.native
}
