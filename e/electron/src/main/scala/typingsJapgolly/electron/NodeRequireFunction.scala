package typingsJapgolly.electron

import typingsJapgolly.electron.anon.TypeofCommon
import typingsJapgolly.electron.anon.TypeofCrossProcessExports
import typingsJapgolly.electron.anon.TypeofMain
import typingsJapgolly.electron.anon.TypeofRenderer
import typingsJapgolly.electron.electronStrings.electronSlashcommon
import typingsJapgolly.electron.electronStrings.electronSlashmain
import typingsJapgolly.electron.electronStrings.electronSlashrenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRequireFunction extends StObject {
  
  def apply(moduleName: typingsJapgolly.electron.electronStrings.electron): TypeofCrossProcessExports = js.native
  def apply(moduleName: electronSlashcommon): TypeofCommon = js.native
  def apply(moduleName: electronSlashmain): TypeofMain = js.native
  def apply(moduleName: electronSlashrenderer): TypeofRenderer = js.native
}
