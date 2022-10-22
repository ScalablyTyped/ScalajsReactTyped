package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMessage extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def CheckName(): Unit
  
  val Creator: Double
  
  def Delete(): Unit
  
  def DisplayMoveDialog(): Unit
  
  def DisplayProperties(): Unit
  
  def DisplaySelectNamesDialog(): Unit
  
  def Forward(): Unit
  
  def GoToNext(): Unit
  
  def GoToPrevious(): Unit
  
  val Parent: Any
  
  def Reply(): Unit
  
  def ReplyAll(): Unit
  
  def ToggleHeader(): Unit
  
  /* private */ @JSName("Word.MailMessage_typekey")
  var WordDotMailMessage_typekey: MailMessage
}
object MailMessage {
  
  inline def apply(
    Application: Application,
    CheckName: Callback,
    Creator: Double,
    Delete: Callback,
    DisplayMoveDialog: Callback,
    DisplayProperties: Callback,
    DisplaySelectNamesDialog: Callback,
    Forward: Callback,
    GoToNext: Callback,
    GoToPrevious: Callback,
    Parent: Any,
    Reply: Callback,
    ReplyAll: Callback,
    ToggleHeader: Callback,
    WordDotMailMessage_typekey: MailMessage
  ): MailMessage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CheckName = CheckName.toJsFn, Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, DisplayMoveDialog = DisplayMoveDialog.toJsFn, DisplayProperties = DisplayProperties.toJsFn, DisplaySelectNamesDialog = DisplaySelectNamesDialog.toJsFn, Forward = Forward.toJsFn, GoToNext = GoToNext.toJsFn, GoToPrevious = GoToPrevious.toJsFn, Parent = Parent.asInstanceOf[js.Any], Reply = Reply.toJsFn, ReplyAll = ReplyAll.toJsFn, ToggleHeader = ToggleHeader.toJsFn)
    __obj.updateDynamic("Word.MailMessage_typekey")(WordDotMailMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  
  extension [Self <: MailMessage](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCheckName(value: Callback): Self = StObject.set(x, "CheckName", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDisplayMoveDialog(value: Callback): Self = StObject.set(x, "DisplayMoveDialog", value.toJsFn)
    
    inline def setDisplayProperties(value: Callback): Self = StObject.set(x, "DisplayProperties", value.toJsFn)
    
    inline def setDisplaySelectNamesDialog(value: Callback): Self = StObject.set(x, "DisplaySelectNamesDialog", value.toJsFn)
    
    inline def setForward(value: Callback): Self = StObject.set(x, "Forward", value.toJsFn)
    
    inline def setGoToNext(value: Callback): Self = StObject.set(x, "GoToNext", value.toJsFn)
    
    inline def setGoToPrevious(value: Callback): Self = StObject.set(x, "GoToPrevious", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReply(value: Callback): Self = StObject.set(x, "Reply", value.toJsFn)
    
    inline def setReplyAll(value: Callback): Self = StObject.set(x, "ReplyAll", value.toJsFn)
    
    inline def setToggleHeader(value: Callback): Self = StObject.set(x, "ToggleHeader", value.toJsFn)
    
    inline def setWordDotMailMessage_typekey(value: MailMessage): Self = StObject.set(x, "Word.MailMessage_typekey", value.asInstanceOf[js.Any])
  }
}
