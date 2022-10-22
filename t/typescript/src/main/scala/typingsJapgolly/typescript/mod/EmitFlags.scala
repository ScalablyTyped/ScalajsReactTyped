package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitFlags extends StObject
@JSImport("typescript", "EmitFlags")
@js.native
object EmitFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFlags & Double] = js.native
  
  @js.native
  sealed trait AdviseOnEmitNode
    extends StObject
       with EmitFlags
  /* 2 */ val AdviseOnEmitNode: typingsJapgolly.typescript.mod.EmitFlags.AdviseOnEmitNode & Double = js.native
  
  @js.native
  sealed trait AsyncFunctionBody
    extends StObject
       with EmitFlags
  /* 262144 */ val AsyncFunctionBody: typingsJapgolly.typescript.mod.EmitFlags.AsyncFunctionBody & Double = js.native
  
  @js.native
  sealed trait CapturesThis
    extends StObject
       with EmitFlags
  /* 8 */ val CapturesThis: typingsJapgolly.typescript.mod.EmitFlags.CapturesThis & Double = js.native
  
  @js.native
  sealed trait CustomPrologue
    extends StObject
       with EmitFlags
  /* 1048576 */ val CustomPrologue: typingsJapgolly.typescript.mod.EmitFlags.CustomPrologue & Double = js.native
  
  @js.native
  sealed trait ExportName
    extends StObject
       with EmitFlags
  /* 8192 */ val ExportName: typingsJapgolly.typescript.mod.EmitFlags.ExportName & Double = js.native
  
  @js.native
  sealed trait HasEndOfDeclarationMarker
    extends StObject
       with EmitFlags
  /* 4194304 */ val HasEndOfDeclarationMarker: typingsJapgolly.typescript.mod.EmitFlags.HasEndOfDeclarationMarker & Double = js.native
  
  @js.native
  sealed trait HelperName
    extends StObject
       with EmitFlags
  /* 4096 */ val HelperName: typingsJapgolly.typescript.mod.EmitFlags.HelperName & Double = js.native
  
  @js.native
  sealed trait Indented
    extends StObject
       with EmitFlags
  /* 65536 */ val Indented: typingsJapgolly.typescript.mod.EmitFlags.Indented & Double = js.native
  
  @js.native
  sealed trait InternalName
    extends StObject
       with EmitFlags
  /* 32768 */ val InternalName: typingsJapgolly.typescript.mod.EmitFlags.InternalName & Double = js.native
  
  @js.native
  sealed trait Iterator
    extends StObject
       with EmitFlags
  /* 8388608 */ val Iterator: typingsJapgolly.typescript.mod.EmitFlags.Iterator & Double = js.native
  
  @js.native
  sealed trait LocalName
    extends StObject
       with EmitFlags
  /* 16384 */ val LocalName: typingsJapgolly.typescript.mod.EmitFlags.LocalName & Double = js.native
  
  @js.native
  sealed trait NoAsciiEscaping
    extends StObject
       with EmitFlags
  /* 16777216 */ val NoAsciiEscaping: typingsJapgolly.typescript.mod.EmitFlags.NoAsciiEscaping & Double = js.native
  
  @js.native
  sealed trait NoComments
    extends StObject
       with EmitFlags
  /* 1536 */ val NoComments: typingsJapgolly.typescript.mod.EmitFlags.NoComments & Double = js.native
  
  @js.native
  sealed trait NoHoisting
    extends StObject
       with EmitFlags
  /* 2097152 */ val NoHoisting: typingsJapgolly.typescript.mod.EmitFlags.NoHoisting & Double = js.native
  
  @js.native
  sealed trait NoIndentation
    extends StObject
       with EmitFlags
  /* 131072 */ val NoIndentation: typingsJapgolly.typescript.mod.EmitFlags.NoIndentation & Double = js.native
  
  @js.native
  sealed trait NoLeadingComments
    extends StObject
       with EmitFlags
  /* 512 */ val NoLeadingComments: typingsJapgolly.typescript.mod.EmitFlags.NoLeadingComments & Double = js.native
  
  @js.native
  sealed trait NoLeadingSourceMap
    extends StObject
       with EmitFlags
  /* 16 */ val NoLeadingSourceMap: typingsJapgolly.typescript.mod.EmitFlags.NoLeadingSourceMap & Double = js.native
  
  @js.native
  sealed trait NoNestedComments
    extends StObject
       with EmitFlags
  /* 2048 */ val NoNestedComments: typingsJapgolly.typescript.mod.EmitFlags.NoNestedComments & Double = js.native
  
  @js.native
  sealed trait NoNestedSourceMaps
    extends StObject
       with EmitFlags
  /* 64 */ val NoNestedSourceMaps: typingsJapgolly.typescript.mod.EmitFlags.NoNestedSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoSourceMap
    extends StObject
       with EmitFlags
  /* 48 */ val NoSourceMap: typingsJapgolly.typescript.mod.EmitFlags.NoSourceMap & Double = js.native
  
  @js.native
  sealed trait NoSubstitution
    extends StObject
       with EmitFlags
  /* 4 */ val NoSubstitution: typingsJapgolly.typescript.mod.EmitFlags.NoSubstitution & Double = js.native
  
  @js.native
  sealed trait NoTokenLeadingSourceMaps
    extends StObject
       with EmitFlags
  /* 128 */ val NoTokenLeadingSourceMaps: typingsJapgolly.typescript.mod.EmitFlags.NoTokenLeadingSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoTokenSourceMaps
    extends StObject
       with EmitFlags
  /* 384 */ val NoTokenSourceMaps: typingsJapgolly.typescript.mod.EmitFlags.NoTokenSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoTokenTrailingSourceMaps
    extends StObject
       with EmitFlags
  /* 256 */ val NoTokenTrailingSourceMaps: typingsJapgolly.typescript.mod.EmitFlags.NoTokenTrailingSourceMaps & Double = js.native
  
  @js.native
  sealed trait NoTrailingComments
    extends StObject
       with EmitFlags
  /* 1024 */ val NoTrailingComments: typingsJapgolly.typescript.mod.EmitFlags.NoTrailingComments & Double = js.native
  
  @js.native
  sealed trait NoTrailingSourceMap
    extends StObject
       with EmitFlags
  /* 32 */ val NoTrailingSourceMap: typingsJapgolly.typescript.mod.EmitFlags.NoTrailingSourceMap & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EmitFlags
  /* 0 */ val None: typingsJapgolly.typescript.mod.EmitFlags.None & Double = js.native
  
  @js.native
  sealed trait ReuseTempVariableScope
    extends StObject
       with EmitFlags
  /* 524288 */ val ReuseTempVariableScope: typingsJapgolly.typescript.mod.EmitFlags.ReuseTempVariableScope & Double = js.native
  
  @js.native
  sealed trait SingleLine
    extends StObject
       with EmitFlags
  /* 1 */ val SingleLine: typingsJapgolly.typescript.mod.EmitFlags.SingleLine & Double = js.native
}
