package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClassMemberKind extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/reflection/src/host", "ClassMemberKind")
@js.native
object ClassMemberKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassMemberKind & Double] = js.native
  
  @js.native
  sealed trait Constructor
    extends StObject
       with ClassMemberKind
  /* 0 */ val Constructor: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Constructor & Double = js.native
  
  @js.native
  sealed trait Getter
    extends StObject
       with ClassMemberKind
  /* 1 */ val Getter: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Getter & Double = js.native
  
  @js.native
  sealed trait Method
    extends StObject
       with ClassMemberKind
  /* 4 */ val Method: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Method & Double = js.native
  
  @js.native
  sealed trait Property
    extends StObject
       with ClassMemberKind
  /* 3 */ val Property: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Property & Double = js.native
  
  @js.native
  sealed trait Setter
    extends StObject
       with ClassMemberKind
  /* 2 */ val Setter: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Setter & Double = js.native
}
