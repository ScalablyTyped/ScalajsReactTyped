package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesOperationMod.Operation
import typingsJapgolly.slate.distInterfacesTypesMod.TextDirection
import typingsJapgolly.slate.slateInts.`-1`
import typingsJapgolly.slate.slateInts.`0`
import typingsJapgolly.slate.slateInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPathMod {
  
  @JSImport("slate/dist/interfaces/path", "Path")
  @js.native
  val Path: PathInterface = js.native
  type Path = js.Array[Double]
  
  trait PathAncestorsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object PathAncestorsOptions {
    
    inline def apply(): PathAncestorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathAncestorsOptions]
    }
    
    extension [Self <: PathAncestorsOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait PathInterface extends StObject {
    
    def ancestors(path: typingsJapgolly.slate.distInterfacesPathMod.Path): js.Array[typingsJapgolly.slate.distInterfacesPathMod.Path] = js.native
    def ancestors(path: typingsJapgolly.slate.distInterfacesPathMod.Path, options: PathAncestorsOptions): js.Array[typingsJapgolly.slate.distInterfacesPathMod.Path] = js.native
    
    def common(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): typingsJapgolly.slate.distInterfacesPathMod.Path = js.native
    
    def compare(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): `-1` | `0` | `1` = js.native
    
    def endsAfter(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def endsAt(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def endsBefore(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def equals(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def hasPrevious(path: typingsJapgolly.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    def isAfter(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isAncestor(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isBefore(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isChild(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isCommon(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isDescendant(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isParent(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def isPath(value: Any): /* is slate.slate/dist/interfaces/path.Path */ Boolean = js.native
    
    def isSibling(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      another: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): Boolean = js.native
    
    def levels(path: typingsJapgolly.slate.distInterfacesPathMod.Path): js.Array[typingsJapgolly.slate.distInterfacesPathMod.Path] = js.native
    def levels(path: typingsJapgolly.slate.distInterfacesPathMod.Path, options: PathLevelsOptions): js.Array[typingsJapgolly.slate.distInterfacesPathMod.Path] = js.native
    
    def next(path: typingsJapgolly.slate.distInterfacesPathMod.Path): typingsJapgolly.slate.distInterfacesPathMod.Path = js.native
    
    def operationCanTransformPath(operation: Operation): Boolean = js.native
    
    def parent(path: typingsJapgolly.slate.distInterfacesPathMod.Path): typingsJapgolly.slate.distInterfacesPathMod.Path = js.native
    
    def previous(path: typingsJapgolly.slate.distInterfacesPathMod.Path): typingsJapgolly.slate.distInterfacesPathMod.Path = js.native
    
    def relative(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      ancestor: typingsJapgolly.slate.distInterfacesPathMod.Path
    ): typingsJapgolly.slate.distInterfacesPathMod.Path = js.native
    
    def transform(path: typingsJapgolly.slate.distInterfacesPathMod.Path, operation: Operation): typingsJapgolly.slate.distInterfacesPathMod.Path | Null = js.native
    def transform(
      path: typingsJapgolly.slate.distInterfacesPathMod.Path,
      operation: Operation,
      options: PathTransformOptions
    ): typingsJapgolly.slate.distInterfacesPathMod.Path | Null = js.native
  }
  
  trait PathLevelsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object PathLevelsOptions {
    
    inline def apply(): PathLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathLevelsOptions]
    }
    
    extension [Self <: PathLevelsOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait PathTransformOptions extends StObject {
    
    var affinity: js.UndefOr[TextDirection | Null] = js.undefined
  }
  object PathTransformOptions {
    
    inline def apply(): PathTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathTransformOptions]
    }
    
    extension [Self <: PathTransformOptions](x: Self) {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
