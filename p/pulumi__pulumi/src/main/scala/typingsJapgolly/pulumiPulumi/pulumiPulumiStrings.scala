package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.automationProjectSettingsMod.ProjectRuntime
import typingsJapgolly.pulumiPulumi.automationStackMod.OpType
import typingsJapgolly.pulumiPulumi.automationStackMod.UpdateKind
import typingsJapgolly.pulumiPulumi.automationStackMod.UpdateResult
import typingsJapgolly.pulumiPulumi.automationWorkspaceMod.PluginKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulumiPulumiStrings {
  
  @js.native
  sealed trait always extends StObject
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait analyzer
    extends StObject
       with PluginKind
  inline def analyzer: analyzer = "analyzer".asInstanceOf[analyzer]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait create
    extends StObject
       with OpType
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait `create-replacement`
    extends StObject
       with OpType
  inline def `create-replacement`: `create-replacement` = "create-replacement".asInstanceOf[`create-replacement`]
  
  @js.native
  sealed trait delete
    extends StObject
       with OpType
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `delete-replaced`
    extends StObject
       with OpType
  inline def `delete-replaced`: `delete-replaced` = "delete-replaced".asInstanceOf[`delete-replaced`]
  
  @js.native
  sealed trait destroy
    extends StObject
       with UpdateKind
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait discard
    extends StObject
       with OpType
  inline def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait `discard-replaced`
    extends StObject
       with OpType
  inline def `discard-replaced`: `discard-replaced` = "discard-replaced".asInstanceOf[`discard-replaced`]
  
  @js.native
  sealed trait dotnet
    extends StObject
       with ProjectRuntime
  inline def dotnet: dotnet = "dotnet".asInstanceOf[dotnet]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failed
    extends StObject
       with UpdateResult
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait getProvider extends StObject
  inline def getProvider: getProvider = "getProvider".asInstanceOf[getProvider]
  
  @js.native
  sealed trait go
    extends StObject
       with ProjectRuntime
  inline def go: go = "go".asInstanceOf[go]
  
  @js.native
  sealed trait `import`
    extends StObject
       with OpType
       with UpdateKind
  inline def `import`: `import` = "import".asInstanceOf[`import`]
  
  @js.native
  sealed trait `import-replacement`
    extends StObject
       with OpType
  inline def `import-replacement`: `import-replacement` = "import-replacement".asInstanceOf[`import-replacement`]
  
  @js.native
  sealed trait `in-progress`
    extends StObject
       with UpdateResult
  inline def `in-progress`: `in-progress` = "in-progress".asInstanceOf[`in-progress`]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait infoNumbersignerr extends StObject
  inline def infoNumbersignerr: infoNumbersignerr = "info#err".asInstanceOf[infoNumbersignerr]
  
  @js.native
  sealed trait language
    extends StObject
       with PluginKind
  inline def language: language = "language".asInstanceOf[language]
  
  @js.native
  sealed trait mandatory extends StObject
  inline def mandatory: mandatory = "mandatory".asInstanceOf[mandatory]
  
  @js.native
  sealed trait never extends StObject
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait nodejs
    extends StObject
       with ProjectRuntime
  inline def nodejs: nodejs = "nodejs".asInstanceOf[nodejs]
  
  @js.native
  sealed trait `not-started`
    extends StObject
       with UpdateResult
  inline def `not-started`: `not-started` = "not-started".asInstanceOf[`not-started`]
  
  @js.native
  sealed trait preview
    extends StObject
       with UpdateKind
  inline def preview: preview = "preview".asInstanceOf[preview]
  
  @js.native
  sealed trait python
    extends StObject
       with ProjectRuntime
  inline def python: python = "python".asInstanceOf[python]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait read
    extends StObject
       with OpType
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait `read-replacement`
    extends StObject
       with OpType
  inline def `read-replacement`: `read-replacement` = "read-replacement".asInstanceOf[`read-replacement`]
  
  @js.native
  sealed trait refresh
    extends StObject
       with OpType
       with UpdateKind
  inline def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait `remove-pending-replace`
    extends StObject
       with OpType
  inline def `remove-pending-replace`: `remove-pending-replace` = "remove-pending-replace".asInstanceOf[`remove-pending-replace`]
  
  @js.native
  sealed trait rename
    extends StObject
       with UpdateKind
  inline def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait replace
    extends StObject
       with OpType
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait resource
    extends StObject
       with PluginKind
  inline def resource: resource = "resource".asInstanceOf[resource]
  
  @js.native
  sealed trait same
    extends StObject
       with OpType
  inline def same: same = "same".asInstanceOf[same]
  
  @js.native
  sealed trait succeeded
    extends StObject
       with UpdateResult
  inline def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait update
    extends StObject
       with OpType
       with UpdateKind
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait urn extends StObject
  inline def urn: urn = "urn".asInstanceOf[urn]
  
  @js.native
  sealed trait warning extends StObject
  inline def warning: warning = "warning".asInstanceOf[warning]
}
