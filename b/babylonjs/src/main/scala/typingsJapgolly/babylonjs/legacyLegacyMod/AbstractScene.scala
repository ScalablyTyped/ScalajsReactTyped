package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.abstractSceneMod.BabylonFileParser
import typingsJapgolly.babylonjs.abstractSceneMod.IndividualBabylonFileParser
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("babylonjs/Legacy/legacy", "AbstractScene")
@js.native
open class AbstractScene ()
  extends typingsJapgolly.babylonjs.indexMod.AbstractScene
/* static members */
object AbstractScene {
  
  @JSImport("babylonjs/Legacy/legacy", "AbstractScene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  inline def AddIndividualParser(name: String, parser: IndividualBabylonFileParser): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddIndividualParser")(name.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  inline def AddParser(name: String, parser: BabylonFileParser): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddParser")(name.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets an individual parser from the list of available ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  inline def GetIndividualParser(name: String): Nullable[IndividualBabylonFileParser] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetIndividualParser")(name.asInstanceOf[js.Any]).asInstanceOf[Nullable[IndividualBabylonFileParser]]
  
  /**
    * Gets a general parser from the list of available ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  inline def GetParser(name: String): Nullable[BabylonFileParser] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetParser")(name.asInstanceOf[js.Any]).asInstanceOf[Nullable[BabylonFileParser]]
  
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  inline def Parse(
    jsonData: Any,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    container: typingsJapgolly.babylonjs.assetContainerMod.AssetContainer,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(jsonData.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], container.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stores the list of available parsers in the application.
    */
  @JSImport("babylonjs/Legacy/legacy", "AbstractScene._BabylonFileParsers")
  @js.native
  def _BabylonFileParsers: Any = js.native
  inline def _BabylonFileParsers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonFileParsers")(x.asInstanceOf[js.Any])
  
  /**
    * Stores the list of available individual parsers in the application.
    */
  @JSImport("babylonjs/Legacy/legacy", "AbstractScene._IndividualBabylonFileParsers")
  @js.native
  def _IndividualBabylonFileParsers: Any = js.native
  inline def _IndividualBabylonFileParsers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IndividualBabylonFileParsers")(x.asInstanceOf[js.Any])
}
