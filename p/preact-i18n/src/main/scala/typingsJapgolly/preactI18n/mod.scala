package typingsJapgolly.preactI18n

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.preact.mod.Component
import typingsJapgolly.preact.mod.ComponentChild
import typingsJapgolly.preact.mod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact-i18n", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IntlProvider ()
    extends Component[
          AnonDefinition, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ js.Any
        ]
  
  @js.native
  class Localizer ()
    extends Component[
          AnonChildren, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ js.Any
        ]
  
  @js.native
  class MarkupText () extends TextComponent
  
  @js.native
  class Text () extends TextComponent
  
  @js.native
  class TextComponent ()
    extends Component[
          AnonFields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ js.Any
        ]
  
  def default(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ _
    ]
  ): VNode[js.Object] = js.native
  def default(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ _
    ],
    options: AnonScope
  ): VNode[js.Object] = js.native
  def withText[Props, Context](mapping: js.Object): js.Function1[
    /* Child */ ComponentChild, 
    Instantiable2[js.UndefOr[/* props */ Props], js.UndefOr[/* context */ Context], js.Any]
  ] = js.native
}

