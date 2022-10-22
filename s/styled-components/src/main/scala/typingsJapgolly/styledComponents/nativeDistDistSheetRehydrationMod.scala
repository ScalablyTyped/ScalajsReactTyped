package typingsJapgolly.styledComponents

import typingsJapgolly.styledComponents.nativeDistDistSheetTypesMod.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistSheetRehydrationMod {
  
  @JSImport("styled-components/native/dist/dist/sheet/Rehydration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def outputSheet(sheet: Sheet): String = ^.asInstanceOf[js.Dynamic].applyDynamic("outputSheet")(sheet.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rehydrateSheet(sheet: Sheet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rehydrateSheet")(sheet.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
