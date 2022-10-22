package typingsJapgolly.karmaJunitReporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ConfigOptions extends StObject {
    
    var junitReporter: js.UndefOr[JUnitReporterConfiguration] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setJunitReporter(value: JUnitReporterConfiguration): Self = StObject.set(x, "junitReporter", value.asInstanceOf[js.Any])
      
      inline def setJunitReporterUndefined: Self = StObject.set(x, "junitReporter", js.undefined)
    }
  }
  
  trait JUnitReporterConfiguration extends StObject {
    
    /** function (browser, result) to customize the classname attribute in xml testcase element */
    var classNameFormatter: js.UndefOr[js.Function2[/* browser */ Any, /* result */ Any, String]] = js.undefined
    
    /** function (browser, result) to customize the name attribute in xml testcase element */
    var nameFormatter: js.UndefOr[js.Function2[/* browser */ Any, /* result */ Any, String]] = js.undefined
    
    /** results will be saved as $outputDir/$browserName.xml */
    var outputDir: js.UndefOr[String] = js.undefined
    
    /** if included, results will be saved as $outputDir/$browserName/$outputFile */
    var outputFile: js.UndefOr[String] = js.undefined
    
    /** key value pair of properties to add to the <properties> section of the report */
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** suite will become the package name attribute in xml testsuite element */
    var suite: js.UndefOr[String] = js.undefined
    
    /** add browser name to report and classes names */
    var useBrowserName: js.UndefOr[Boolean] = js.undefined
    
    /** use '1' if reporting to be per SonarQube 6.2 XML format */
    var xmlVersion: js.UndefOr[Double | Null] = js.undefined
  }
  object JUnitReporterConfiguration {
    
    inline def apply(): JUnitReporterConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JUnitReporterConfiguration]
    }
    
    extension [Self <: JUnitReporterConfiguration](x: Self) {
      
      inline def setClassNameFormatter(value: (/* browser */ Any, /* result */ Any) => String): Self = StObject.set(x, "classNameFormatter", js.Any.fromFunction2(value))
      
      inline def setClassNameFormatterUndefined: Self = StObject.set(x, "classNameFormatter", js.undefined)
      
      inline def setNameFormatter(value: (/* browser */ Any, /* result */ Any) => String): Self = StObject.set(x, "nameFormatter", js.Any.fromFunction2(value))
      
      inline def setNameFormatterUndefined: Self = StObject.set(x, "nameFormatter", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
      
      inline def setUseBrowserName(value: Boolean): Self = StObject.set(x, "useBrowserName", value.asInstanceOf[js.Any])
      
      inline def setUseBrowserNameUndefined: Self = StObject.set(x, "useBrowserName", js.undefined)
      
      inline def setXmlVersion(value: Double): Self = StObject.set(x, "xmlVersion", value.asInstanceOf[js.Any])
      
      inline def setXmlVersionNull: Self = StObject.set(x, "xmlVersion", null)
      
      inline def setXmlVersionUndefined: Self = StObject.set(x, "xmlVersion", js.undefined)
    }
  }
}
