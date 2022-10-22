package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAdapterObject extends StObject {
  
  var AttachmentFileName: String
  
  var AttachmentType: XdAttachmentType
  
  var BCC: String
  
  var CC: String
  
  /* private */ @JSName("InfoPath.EmailAdapterObject_typekey")
  var InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject
  
  var Intro: String
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  var Subject: String
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
  
  def SubmitData(pData: IXMLDOMNode): Unit
  
  var To: String
}
object EmailAdapterObject {
  
  inline def apply(
    AttachmentFileName: String,
    AttachmentType: XdAttachmentType,
    BCC: String,
    CC: String,
    InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject,
    Intro: String,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    Subject: String,
    Submit: Callback,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Callback,
    To: String
  ): EmailAdapterObject = {
    val __obj = js.Dynamic.literal(AttachmentFileName = AttachmentFileName.asInstanceOf[js.Any], AttachmentType = AttachmentType.asInstanceOf[js.Any], BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Intro = Intro.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1((t0: IXMLDOMNode) => SubmitData(t0).runNow()), To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.EmailAdapterObject_typekey")(InfoPathDotEmailAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAdapterObject]
  }
  
  extension [Self <: EmailAdapterObject](x: Self) {
    
    inline def setAttachmentFileName(value: String): Self = StObject.set(x, "AttachmentFileName", value.asInstanceOf[js.Any])
    
    inline def setAttachmentType(value: XdAttachmentType): Self = StObject.set(x, "AttachmentType", value.asInstanceOf[js.Any])
    
    inline def setBCC(value: String): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
    
    inline def setCC(value: String): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotEmailAdapterObject_typekey(value: EmailAdapterObject): Self = StObject.set(x, "InfoPath.EmailAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setIntro(value: String): Self = StObject.set(x, "Intro", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmitData(value: IXMLDOMNode => Callback): Self = StObject.set(x, "SubmitData", js.Any.fromFunction1((t0: IXMLDOMNode) => value(t0).runNow()))
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
