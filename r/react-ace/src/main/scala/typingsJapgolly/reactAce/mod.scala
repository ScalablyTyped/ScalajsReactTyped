package typingsJapgolly.reactAce

import typingsJapgolly.reactAce.anon.PartialIAceEditorProps
import typingsJapgolly.reactAce.anon.PartialIDiffEditorProps
import typingsJapgolly.reactAce.anon.PartialISplitEditorProps
import typingsJapgolly.reactAce.anon.ValidationMapIAceEditorPr
import typingsJapgolly.reactAce.anon.ValidationMapIDiffEditorP
import typingsJapgolly.reactAce.anon.ValidationMapISplitEditor
import typingsJapgolly.reactAce.libAceMod.IAceEditorProps
import typingsJapgolly.reactAce.libDiffMod.IDiffEditorProps
import typingsJapgolly.reactAce.libSplitMod.ISplitEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ace", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.reactAce.libAceMod.default {
    def this(props: IAceEditorProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-ace", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace", "default.defaultProps")
    @js.native
    def defaultProps: PartialIAceEditorProps = js.native
    inline def defaultProps_=(x: PartialIAceEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace", "default.propTypes")
    @js.native
    def propTypes: ValidationMapIAceEditorPr = js.native
    inline def propTypes_=(x: ValidationMapIAceEditorPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-ace", "diff")
  @js.native
  open class diff protected ()
    extends typingsJapgolly.reactAce.libDiffMod.default {
    def this(props: IDiffEditorProps) = this()
  }
  /* static members */
  object diff {
    
    @JSImport("react-ace", "diff")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace", "diff.defaultProps")
    @js.native
    def defaultProps: PartialIDiffEditorProps = js.native
    inline def defaultProps_=(x: PartialIDiffEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace", "diff.propTypes")
    @js.native
    def propTypes: ValidationMapIDiffEditorP = js.native
    inline def propTypes_=(x: ValidationMapIDiffEditorP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-ace", "split")
  @js.native
  open class split protected ()
    extends typingsJapgolly.reactAce.libSplitMod.default {
    def this(props: ISplitEditorProps) = this()
  }
  /* static members */
  object split {
    
    @JSImport("react-ace", "split")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace", "split.defaultProps")
    @js.native
    def defaultProps: PartialISplitEditorProps = js.native
    inline def defaultProps_=(x: PartialISplitEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace", "split.propTypes")
    @js.native
    def propTypes: ValidationMapISplitEditor = js.native
    inline def propTypes_=(x: ValidationMapISplitEditor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
