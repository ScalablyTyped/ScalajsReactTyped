package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkFormat extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var AutoUpdate: PpUpdateOption
  
  def BreakLink(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: LinkFormat
  
  var SourceFullName: String
  
  def Update(): Unit
}
object LinkFormat {
  
  inline def apply(
    Application: Application,
    AutoUpdate: PpUpdateOption,
    BreakLink: Callback,
    Parent: Any,
    PowerPointDotLinkFormat_typekey: LinkFormat,
    SourceFullName: String,
    Update: Callback
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = BreakLink.toJsFn, Parent = Parent.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], Update = Update.toJsFn)
    __obj.updateDynamic("PowerPoint.LinkFormat_typekey")(PowerPointDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  extension [Self <: LinkFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdate(value: PpUpdateOption): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setBreakLink(value: Callback): Self = StObject.set(x, "BreakLink", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "PowerPoint.LinkFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "Update", value.toJsFn)
  }
}
