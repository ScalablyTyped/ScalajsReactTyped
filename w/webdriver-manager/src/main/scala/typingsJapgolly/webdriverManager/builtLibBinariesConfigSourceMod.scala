package typingsJapgolly.webdriverManager

import typingsJapgolly.webdriverManager.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibBinariesConfigSourceMod {
  
  /* note: abstract class */ @JSImport("webdriver-manager/built/lib/binaries/config_source", "ConfigSource")
  @js.native
  open class ConfigSource () extends StObject {
    
    def getUrl(version: String): js.Promise[Url] = js.native
    
    def getVersionList(): js.Promise[js.Array[String]] = js.native
    
    var osarch: String = js.native
    
    var ostype: String = js.native
    
    var out_dir: String = js.native
  }
  
  /* note: abstract class */ @JSImport("webdriver-manager/built/lib/binaries/config_source", "GithubApiConfigSource")
  @js.native
  open class GithubApiConfigSource protected () extends JsonConfigSource {
    def this(name: String, url: String) = this()
    
    /* private */ def readResponse(): Any = js.native
    
    /* private */ def requestJson(): Any = js.native
  }
  
  /* note: abstract class */ @JSImport("webdriver-manager/built/lib/binaries/config_source", "JsonConfigSource")
  @js.native
  open class JsonConfigSource protected () extends ConfigSource {
    def this(name: String, jsonUrl: String) = this()
    
    /* protected */ def getFileName(): String = js.native
    
    /* protected */ def getJson(): js.Promise[String] = js.native
    
    var jsonUrl: String = js.native
    
    var name: String = js.native
  }
  
  /* note: abstract class */ @JSImport("webdriver-manager/built/lib/binaries/config_source", "XmlConfigSource")
  @js.native
  open class XmlConfigSource protected () extends ConfigSource {
    def this(name: String, xmlUrl: String) = this()
    
    /* private */ def convertXml2js(xml: Any): Any = js.native
    
    /* protected */ def getFileName(): String = js.native
    
    /* protected */ def getXml(): js.Promise[Any] = js.native
    
    var name: String = js.native
    
    /* private */ def readResponse(): Any = js.native
    
    /* private */ def requestXml(): Any = js.native
    
    var xmlUrl: String = js.native
  }
}
