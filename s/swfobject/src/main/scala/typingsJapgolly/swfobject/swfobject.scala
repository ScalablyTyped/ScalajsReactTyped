package typingsJapgolly.swfobject

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.swfobject.anon.Ie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swfobject {
  
  trait ICallbackObj extends StObject {
    
    var id: String
    
    var ref: js.UndefOr[HTMLElement] = js.undefined
    
    var success: Boolean
  }
  object ICallbackObj {
    
    inline def apply(id: String, success: Boolean): ICallbackObj = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICallbackObj]
    }
    
    extension [Self <: ICallbackObj](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: HTMLElement): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFlashPlayerVersion extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var release: Double
  }
  object IFlashPlayerVersion {
    
    inline def apply(major: Double, minor: Double, release: Double): IFlashPlayerVersion = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFlashPlayerVersion]
    }
    
    extension [Self <: IFlashPlayerVersion](x: Self) {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISwfObjectAttribute extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object ISwfObjectAttribute {
    
    inline def apply(): ISwfObjectAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwfObjectAttribute]
    }
    
    extension [Self <: ISwfObjectAttribute](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ISwfObjectParameter extends StObject {
    
    var flashvars: js.UndefOr[String] = js.undefined
  }
  object ISwfObjectParameter {
    
    inline def apply(): ISwfObjectParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwfObjectParameter]
    }
    
    extension [Self <: ISwfObjectParameter](x: Self) {
      
      inline def setFlashvars(value: String): Self = StObject.set(x, "flashvars", value.asInstanceOf[js.Any])
      
      inline def setFlashvarsUndefined: Self = StObject.set(x, "flashvars", js.undefined)
    }
  }
  
  @js.native
  trait SwfObject extends StObject {
    
    def addDomLoadEvent(fn: js.Function0[Unit]): Unit = js.native
    
    def addLoadEvent(fn: js.Function1[/* event */ js.UndefOr[Event], Unit]): Unit = js.native
    
    def createCSS(selStr: String, declStr: String): Unit = js.native
    def createCSS(selStr: String, declStr: String, mediaStr: String): Unit = js.native
    def createCSS(selStr: String, declStr: String, mediaStr: String, newStyleBoolean: Boolean): Unit = js.native
    def createCSS(selStr: String, declStr: String, mediaStr: Unit, newStyleBoolean: Boolean): Unit = js.native
    
    def createSWF(attObj: ISwfObjectAttribute, parObj: ISwfObjectParameter, replaceElemIdStr: String): HTMLElement = js.native
    
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: js.Object,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: js.Object,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: js.Object,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: Unit,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: Unit,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: js.Object,
      parObj: Unit,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: js.Object,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: js.Object,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: js.Object,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: Unit,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: Unit,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      flashvarsObj: Unit,
      parObj: Unit,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: js.Object,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: js.Object,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: js.Object,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: Unit,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: Unit,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: js.Object,
      parObj: Unit,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: js.Object,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: js.Object,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: js.Object,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: Unit,
      attObj: js.Object
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: Unit,
      attObj: js.Object,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def embedSWF(
      swfUrlStr: String,
      replaceElemIdStr: String,
      widthStr: String,
      heightStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      flashvarsObj: Unit,
      parObj: Unit,
      attObj: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    
    def getFlashPlayerVersion(): IFlashPlayerVersion = js.native
    
    def getObjectById(objectIdStr: String): HTMLElement = js.native
    
    def getQueryParamValue(): String = js.native
    def getQueryParamValue(param: String): String = js.native
    
    def hasFlashPlayerVersion(rv: String): Boolean = js.native
    
    def registerObject(objectIdStr: String, swfVersionStr: String): Unit = js.native
    def registerObject(objectIdStr: String, swfVersionStr: String, xiSwfUrlStr: String): Unit = js.native
    def registerObject(
      objectIdStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: String,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    def registerObject(
      objectIdStr: String,
      swfVersionStr: String,
      xiSwfUrlStr: Unit,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    
    def removeSWF(objElemIdStr: String): Unit = js.native
    
    def showExpressInstall(att: ISwfObjectAttribute, par: ISwfObjectParameter, replaceElemIdStr: String): Unit = js.native
    def showExpressInstall(
      att: ISwfObjectAttribute,
      par: ISwfObjectParameter,
      replaceElemIdStr: String,
      callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
    ): Unit = js.native
    
    def switchOffAutoHideShow(): Unit = js.native
    
    var ua: Ie = js.native
  }
}
