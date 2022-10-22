package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcModelsMod.Options
import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcParsedFeatureLoadingMod {
  
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadFeature(featureFilePath: String): ParsedFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFeature")(featureFilePath.asInstanceOf[js.Any]).asInstanceOf[ParsedFeature]
  inline def loadFeature(featureFilePath: String, options: Options): ParsedFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFeature")(featureFilePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedFeature]
  
  inline def loadFeatures(globPattern: String): js.Array[ParsedFeature] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFeatures")(globPattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedFeature]]
  inline def loadFeatures(globPattern: String, options: Options): js.Array[ParsedFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFeatures")(globPattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedFeature]]
  
  inline def parseFeature(featureText: String): ParsedFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFeature")(featureText.asInstanceOf[js.Any]).asInstanceOf[ParsedFeature]
  inline def parseFeature(featureText: String, options: Options): ParsedFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFeature")(featureText.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedFeature]
}
