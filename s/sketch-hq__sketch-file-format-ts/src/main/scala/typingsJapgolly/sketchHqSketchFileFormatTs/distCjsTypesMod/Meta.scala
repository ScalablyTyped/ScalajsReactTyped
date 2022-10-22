package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sketchHqSketchFileFormatTs.anon.App
import typingsJapgolly.sketchHqSketchFileFormatTs.anon.Artboards
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`121`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`122`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`123`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`124`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`125`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`126`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`127`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`128`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`129`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`130`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`131`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`132`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`133`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`134`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`135`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`136`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`137`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`138`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`139`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`140`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`141`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`142`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`143`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`144`
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsInts.`99`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var app: BundleId
  
  var appVersion: String
  
  var autosaved: NumericalBool
  
  var build: Double
  
  var coeditCompatibilityVersion: js.UndefOr[Double] = js.undefined
  
  var commit: String
  
  var compatibilityVersion: `99`
  
  var created: App
  
  var pagesAndArtboards: StringDictionary[Artboards]
  
  var saveHistory: js.Array[String]
  
  var variant: SketchVariant
  
  var version: `121` | `122` | `123` | `124` | `125` | `126` | `127` | `128` | `129` | `130` | `131` | `132` | `133` | `134` | `135` | `136` | `137` | `138` | `139` | `140` | `141` | `142` | `143` | `144`
}
object Meta {
  
  inline def apply(
    app: BundleId,
    appVersion: String,
    autosaved: NumericalBool,
    build: Double,
    commit: String,
    created: App,
    pagesAndArtboards: StringDictionary[Artboards],
    saveHistory: js.Array[String],
    variant: SketchVariant,
    version: `121` | `122` | `123` | `124` | `125` | `126` | `127` | `128` | `129` | `130` | `131` | `132` | `133` | `134` | `135` | `136` | `137` | `138` | `139` | `140` | `141` | `142` | `143` | `144`
  ): Meta = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], autosaved = autosaved.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = 99, created = created.asInstanceOf[js.Any], pagesAndArtboards = pagesAndArtboards.asInstanceOf[js.Any], saveHistory = saveHistory.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def setApp(value: BundleId): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAutosaved(value: NumericalBool): Self = StObject.set(x, "autosaved", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setCoeditCompatibilityVersion(value: Double): Self = StObject.set(x, "coeditCompatibilityVersion", value.asInstanceOf[js.Any])
    
    inline def setCoeditCompatibilityVersionUndefined: Self = StObject.set(x, "coeditCompatibilityVersion", js.undefined)
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityVersion(value: `99`): Self = StObject.set(x, "compatibilityVersion", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: App): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setPagesAndArtboards(value: StringDictionary[Artboards]): Self = StObject.set(x, "pagesAndArtboards", value.asInstanceOf[js.Any])
    
    inline def setSaveHistory(value: js.Array[String]): Self = StObject.set(x, "saveHistory", value.asInstanceOf[js.Any])
    
    inline def setSaveHistoryVarargs(value: String*): Self = StObject.set(x, "saveHistory", js.Array(value*))
    
    inline def setVariant(value: SketchVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVersion(
      value: `121` | `122` | `123` | `124` | `125` | `126` | `127` | `128` | `129` | `130` | `131` | `132` | `133` | `134` | `135` | `136` | `137` | `138` | `139` | `140` | `141` | `142` | `143` | `144`
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
