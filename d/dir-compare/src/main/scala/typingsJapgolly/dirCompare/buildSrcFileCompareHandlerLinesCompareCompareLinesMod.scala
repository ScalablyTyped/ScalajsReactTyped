package typingsJapgolly.dirCompare

import typingsJapgolly.dirCompare.buildSrcFileCompareHandlerLinesCompareCompareLinesResultMod.CompareLinesResult
import typingsJapgolly.dirCompare.buildSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFileCompareHandlerLinesCompareCompareLinesMod {
  
  @JSImport("dir-compare/build/src/FileCompareHandler/lines/compare/compareLines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareLines(lines1: js.Array[String], lines2: js.Array[String], options: Options): CompareLinesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLines")(lines1.asInstanceOf[js.Any], lines2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompareLinesResult]
}
