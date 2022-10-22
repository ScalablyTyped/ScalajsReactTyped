package typingsJapgolly.qiniu

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cond extends StObject {
    
    var cond: js.UndefOr[Fsize] = js.undefined
    
    var deleteAfterDays: js.UndefOr[Double] = js.undefined
    
    var toArchiveAfterDays: js.UndefOr[Double] = js.undefined
    
    var toDeepArchiveAfterDays: js.UndefOr[Double] = js.undefined
    
    var toIaAfterDays: js.UndefOr[Double] = js.undefined
  }
  object Cond {
    
    inline def apply(): Cond = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cond]
    }
    
    extension [Self <: Cond](x: Self) {
      
      inline def setCond(value: Fsize): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
      
      inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
      
      inline def setDeleteAfterDays(value: Double): Self = StObject.set(x, "deleteAfterDays", value.asInstanceOf[js.Any])
      
      inline def setDeleteAfterDaysUndefined: Self = StObject.set(x, "deleteAfterDays", js.undefined)
      
      inline def setToArchiveAfterDays(value: Double): Self = StObject.set(x, "toArchiveAfterDays", value.asInstanceOf[js.Any])
      
      inline def setToArchiveAfterDaysUndefined: Self = StObject.set(x, "toArchiveAfterDays", js.undefined)
      
      inline def setToDeepArchiveAfterDays(value: Double): Self = StObject.set(x, "toDeepArchiveAfterDays", value.asInstanceOf[js.Any])
      
      inline def setToDeepArchiveAfterDaysUndefined: Self = StObject.set(x, "toDeepArchiveAfterDays", js.undefined)
      
      inline def setToIaAfterDays(value: Double): Self = StObject.set(x, "toIaAfterDays", value.asInstanceOf[js.Any])
      
      inline def setToIaAfterDaysUndefined: Self = StObject.set(x, "toIaAfterDays", js.undefined)
    }
  }
  
  trait Connection extends StObject {
    
    var Connection: js.UndefOr[String] = js.undefined
    
    var `User-Agent`: js.UndefOr[String] = js.undefined
  }
  object Connection {
    
    inline def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnection(value: String): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
      
      inline def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
      
      inline def `setUser-AgentUndefined`: Self = StObject.set(x, "User-Agent", js.undefined)
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var mobiles: js.Array[String]
    
    var template_type: String
  }
  object Content {
    
    inline def apply(content: String, mobiles: js.Array[String], template_type: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], mobiles = mobiles.asInstanceOf[js.Any], template_type = template_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMobiles(value: js.Array[String]): Self = StObject.set(x, "mobiles", value.asInstanceOf[js.Any])
      
      inline def setMobilesVarargs(value: String*): Self = StObject.set(x, "mobiles", js.Array(value*))
      
      inline def setTemplate_type(value: String): Self = StObject.set(x, "template_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deleteafterdays extends StObject {
    
    var delete_after_days: js.UndefOr[Double] = js.undefined
    
    var history_delete_after_days: js.UndefOr[Double] = js.undefined
    
    var history_to_line_after_days: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var to_archive_after_days: js.UndefOr[Double] = js.undefined
    
    var to_deep_archive_after_days: js.UndefOr[Double] = js.undefined
    
    var to_line_after_days: js.UndefOr[Double] = js.undefined
  }
  object Deleteafterdays {
    
    inline def apply(name: String): Deleteafterdays = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deleteafterdays]
    }
    
    extension [Self <: Deleteafterdays](x: Self) {
      
      inline def setDelete_after_days(value: Double): Self = StObject.set(x, "delete_after_days", value.asInstanceOf[js.Any])
      
      inline def setDelete_after_daysUndefined: Self = StObject.set(x, "delete_after_days", js.undefined)
      
      inline def setHistory_delete_after_days(value: Double): Self = StObject.set(x, "history_delete_after_days", value.asInstanceOf[js.Any])
      
      inline def setHistory_delete_after_daysUndefined: Self = StObject.set(x, "history_delete_after_days", js.undefined)
      
      inline def setHistory_to_line_after_days(value: Double): Self = StObject.set(x, "history_to_line_after_days", value.asInstanceOf[js.Any])
      
      inline def setHistory_to_line_after_daysUndefined: Self = StObject.set(x, "history_to_line_after_days", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTo_archive_after_days(value: Double): Self = StObject.set(x, "to_archive_after_days", value.asInstanceOf[js.Any])
      
      inline def setTo_archive_after_daysUndefined: Self = StObject.set(x, "to_archive_after_days", js.undefined)
      
      inline def setTo_deep_archive_after_days(value: Double): Self = StObject.set(x, "to_deep_archive_after_days", value.asInstanceOf[js.Any])
      
      inline def setTo_deep_archive_after_daysUndefined: Self = StObject.set(x, "to_deep_archive_after_days", js.undefined)
      
      inline def setTo_line_after_days(value: Double): Self = StObject.set(x, "to_line_after_days", value.asInstanceOf[js.Any])
      
      inline def setTo_line_after_daysUndefined: Self = StObject.set(x, "to_line_after_days", js.undefined)
    }
  }
  
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object Force {
    
    inline def apply(): Force = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  trait Fsize extends StObject {
    
    var fsize: js.UndefOr[Double] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var mime: js.UndefOr[String] = js.undefined
    
    var putTime: js.UndefOr[Double] = js.undefined
  }
  object Fsize {
    
    inline def apply(): Fsize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fsize]
    }
    
    extension [Self <: Fsize](x: Self) {
      
      inline def setFsize(value: Double): Self = StObject.set(x, "fsize", value.asInstanceOf[js.Any])
      
      inline def setFsizeUndefined: Self = StObject.set(x, "fsize", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      inline def setPutTime(value: Double): Self = StObject.set(x, "putTime", value.asInstanceOf[js.Any])
      
      inline def setPutTimeUndefined: Self = StObject.set(x, "putTime", js.undefined)
    }
  }
  
  trait Mobile extends StObject {
    
    var mobile: String
    
    var parameters: js.UndefOr[Record[String, String]] = js.undefined
    
    var template_id: String
  }
  object Mobile {
    
    inline def apply(mobile: String, template_id: String): Mobile = {
      val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mobile]
    }
    
    extension [Self <: Mobile](x: Self) {
      
      inline def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mobiles extends StObject {
    
    var mobiles: js.Array[String]
    
    var parameters: js.UndefOr[Record[String, String]] = js.undefined
    
    var template_id: String
  }
  object Mobiles {
    
    inline def apply(mobiles: js.Array[String], template_id: String): Mobiles = {
      val __obj = js.Dynamic.literal(mobiles = mobiles.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mobiles]
    }
    
    extension [Self <: Mobiles](x: Self) {
      
      inline def setMobiles(value: js.Array[String]): Self = StObject.set(x, "mobiles", value.asInstanceOf[js.Any])
      
      inline def setMobilesVarargs(value: String*): Self = StObject.set(x, "mobiles", js.Array(value*))
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    }
  }
}
