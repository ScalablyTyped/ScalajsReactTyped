package typingsJapgolly.fpTs.indexMod

import typingsJapgolly.fpTs.libMonadMod.Monad
import typingsJapgolly.fpTs.libMonadMod.Monad1
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libMonadMod.Monad2C
import typingsJapgolly.fpTs.libMonadMod.Monad3
import typingsJapgolly.fpTs.libWriterTMod.WriterM
import typingsJapgolly.fpTs.libWriterTMod.WriterM1
import typingsJapgolly.fpTs.libWriterTMod.WriterM2
import typingsJapgolly.fpTs.libWriterTMod.WriterM2C
import typingsJapgolly.fpTs.libWriterTMod.WriterM3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerT {
  
  @JSImport("fp-ts/index", "writerT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWriterM[M](M: Monad[M]): WriterM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): WriterM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM1[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): WriterM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): WriterM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM3[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): WriterM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2C[M, E]]
}
