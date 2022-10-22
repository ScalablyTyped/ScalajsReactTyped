package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.download
import typingsJapgolly.ionicAngular.ionicAngularStrings.expandable
import typingsJapgolly.ionicAngular.ionicAngularStrings.href
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.rel
import typingsJapgolly.ionicAngular.ionicAngularStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Download extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var download: typingsJapgolly.ionicAngular.ionicAngularStrings.download
  
  var expandable: typingsJapgolly.ionicAngular.ionicAngularStrings.expandable
  
  var href: typingsJapgolly.ionicAngular.ionicAngularStrings.href
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var rel: typingsJapgolly.ionicAngular.ionicAngularStrings.rel
  
  var target: typingsJapgolly.ionicAngular.ionicAngularStrings.target
  
  var `type`: typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
}
object Download {
  
  inline def apply(): Download = {
    val __obj = js.Dynamic.literal(color = "color", disabled = "disabled", download = "download", expandable = "expandable", href = "href", mode = "mode", rel = "rel", target = "target")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[Download]
  }
  
  extension [Self <: Download](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: download): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setExpandable(value: expandable): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setHref(value: href): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRel(value: rel): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
