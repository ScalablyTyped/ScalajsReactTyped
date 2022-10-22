package typingsJapgolly.ky

import org.scalajs.dom.Headers
import typingsJapgolly.ky.anon.PartialOptions
import typingsJapgolly.ky.distributionTypesOptionsMod.KyHeadersInit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionUtilsMergeMod {
  
  @JSImport("ky/distribution/utils/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepMerge[T](sources: js.UndefOr[Partial[T]]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepMerge")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
  
  inline def mergeHeaders(): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeaders")().asInstanceOf[Headers]
  inline def mergeHeaders(source1: Unit, source2: KyHeadersInit): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeaders")(source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[Headers]
  inline def mergeHeaders(source1: KyHeadersInit): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeaders")(source1.asInstanceOf[js.Any]).asInstanceOf[Headers]
  inline def mergeHeaders(source1: KyHeadersInit, source2: KyHeadersInit): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeaders")(source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[Headers]
  
  inline def validateAndMerge(sources: js.UndefOr[PartialOptions]*): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndMerge")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[PartialOptions]
}
