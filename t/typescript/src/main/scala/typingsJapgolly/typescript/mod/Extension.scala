package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Extension extends StObject
@JSImport("typescript", "Extension")
@js.native
object Extension extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[Extension & java.lang.String] = js.native
  
  @js.native
  sealed trait Cjs
    extends StObject
       with Extension
  /* ".cjs" */ val Cjs: typingsJapgolly.typescript.mod.Extension.Cjs & java.lang.String = js.native
  
  @js.native
  sealed trait Cts
    extends StObject
       with Extension
  /* ".cts" */ val Cts: typingsJapgolly.typescript.mod.Extension.Cts & java.lang.String = js.native
  
  @js.native
  sealed trait Dcts
    extends StObject
       with Extension
  /* ".d.cts" */ val Dcts: typingsJapgolly.typescript.mod.Extension.Dcts & java.lang.String = js.native
  
  @js.native
  sealed trait Dmts
    extends StObject
       with Extension
  /* ".d.mts" */ val Dmts: typingsJapgolly.typescript.mod.Extension.Dmts & java.lang.String = js.native
  
  @js.native
  sealed trait Dts
    extends StObject
       with Extension
  /* ".d.ts" */ val Dts: typingsJapgolly.typescript.mod.Extension.Dts & java.lang.String = js.native
  
  @js.native
  sealed trait Js
    extends StObject
       with Extension
  /* ".js" */ val Js: typingsJapgolly.typescript.mod.Extension.Js & java.lang.String = js.native
  
  @js.native
  sealed trait Json
    extends StObject
       with Extension
  /* ".json" */ val Json: typingsJapgolly.typescript.mod.Extension.Json & java.lang.String = js.native
  
  @js.native
  sealed trait Jsx
    extends StObject
       with Extension
  /* ".jsx" */ val Jsx: typingsJapgolly.typescript.mod.Extension.Jsx & java.lang.String = js.native
  
  @js.native
  sealed trait Mjs
    extends StObject
       with Extension
  /* ".mjs" */ val Mjs: typingsJapgolly.typescript.mod.Extension.Mjs & java.lang.String = js.native
  
  @js.native
  sealed trait Mts
    extends StObject
       with Extension
  /* ".mts" */ val Mts: typingsJapgolly.typescript.mod.Extension.Mts & java.lang.String = js.native
  
  @js.native
  sealed trait Ts
    extends StObject
       with Extension
  /* ".ts" */ val Ts: typingsJapgolly.typescript.mod.Extension.Ts & java.lang.String = js.native
  
  @js.native
  sealed trait TsBuildInfo
    extends StObject
       with Extension
  /* ".tsbuildinfo" */ val TsBuildInfo: typingsJapgolly.typescript.mod.Extension.TsBuildInfo & java.lang.String = js.native
  
  @js.native
  sealed trait Tsx
    extends StObject
       with Extension
  /* ".tsx" */ val Tsx: typingsJapgolly.typescript.mod.Extension.Tsx & java.lang.String = js.native
}
