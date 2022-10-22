package typingsJapgolly.postcss.mod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.postcss.libAtRuleMod.AtRuleProps
import typingsJapgolly.postcss.libCommentMod.CommentProps
import typingsJapgolly.postcss.libCssSyntaxErrorMod.RangePosition
import typingsJapgolly.postcss.libDeclarationMod.DeclarationProps
import typingsJapgolly.postcss.libResultMod.ResultOptions
import typingsJapgolly.postcss.libRootMod.RootProps
import typingsJapgolly.postcss.libRuleMod.RuleProps
import typingsJapgolly.postcss.libWarningMod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default extends Shortcut {
  
  @JSImport("postcss", JSImport.Default)
  @js.native
  val ^ : Postcss = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.AtRule")
  @js.native
  open class AtRuleCls ()
    extends typingsJapgolly.postcss.libAtRuleMod.default {
    def this(defaults: AtRuleProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Comment")
  @js.native
  open class CommentCls ()
    extends typingsJapgolly.postcss.libCommentMod.default {
    def this(defaults: CommentProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Container")
  @js.native
  open class ContainerCls[Child /* <: typingsJapgolly.postcss.libNodeMod.default */] ()
    extends typingsJapgolly.postcss.libContainerMod.default[Child]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.CssSyntaxError")
  @js.native
  open class CssSyntaxErrorCls protected ()
    extends typingsJapgolly.postcss.libCssSyntaxErrorMod.default {
    /**
      * Instantiates a CSS syntax error. Can be instantiated for a single position
      * or for a range.
      * @param message        Error message.
      * @param lineOrStartPos If for a single position, the line number, or if for
      *                       a range, the inclusive start position of the error.
      * @param columnOrEndPos If for a single position, the column number, or if for
      *                       a range, the exclusive end position of the error.
      * @param source         Source code of the broken file.
      * @param file           Absolute path to the broken file.
      * @param plugin         PostCSS plugin name, if error came from plugin.
      */
    def this(
      message: String,
      lineOrStartPos: js.UndefOr[Double | RangePosition],
      columnOrEndPos: js.UndefOr[Double | RangePosition],
      source: js.UndefOr[String],
      file: js.UndefOr[String],
      plugin: js.UndefOr[String]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Declaration")
  @js.native
  open class DeclarationCls ()
    extends typingsJapgolly.postcss.libDeclarationMod.default {
    def this(defaults: DeclarationProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Input")
  @js.native
  open class InputCls protected ()
    extends typingsJapgolly.postcss.libInputMod.default {
    /**
      * @param css  Input CSS source.
      * @param opts Process options.
      */
    def this(css: String) = this()
    def this(css: String, opts: ProcessOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Node")
  @js.native
  /**
    * @param defaults Value for node properties.
    */
  open class NodeCls ()
    extends typingsJapgolly.postcss.libNodeMod.default {
    def this(defaults: js.Object) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Result")
  @js.native
  open class ResultCls protected ()
    extends typingsJapgolly.postcss.libResultMod.default {
    def this(processor: typingsJapgolly.postcss.libProcessorMod.default, root: Document, opts: ResultOptions) = this()
    /**
      * @param processor Processor used for this transformation.
      * @param root      Root node after all transformations.
      * @param opts      Options from the `Processor#process` or `Root#toResult`.
      */
    def this(processor: typingsJapgolly.postcss.libProcessorMod.default, root: Root_, opts: ResultOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Root")
  @js.native
  open class RootCls ()
    extends typingsJapgolly.postcss.libRootMod.default {
    def this(defaults: RootProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Rule")
  @js.native
  open class RuleCls ()
    extends typingsJapgolly.postcss.libRuleMod.default {
    def this(defaults: RuleProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Warning")
  @js.native
  open class WarningCls protected ()
    extends typingsJapgolly.postcss.libWarningMod.default {
    /**
      * @param text Warning message.
      * @param opts Warning options.
      */
    def this(text: String) = this()
    def this(text: String, opts: WarningOptions) = this()
  }
  
  type _To = Postcss
  
  /* This means you don't have to write `^`, but can instead just say `default.foo` */
  override def _to: Postcss = ^
}
