package typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry

import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to clone a rendermime instance.
  */
trait ICloneOptions extends js.Object {
  /**
    * The new LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.undefined
  /**
    * The new path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.undefined
  /**
    * The new resolver object.
    */
  var resolver: js.UndefOr[IResolver] = js.undefined
  /**
    * The new sanitizer used to sanitize untrusted html inputs.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.undefined
}

object ICloneOptions {
  @scala.inline
  def apply(
    latexTypesetter: ILatexTypesetter = null,
    linkHandler: ILinkHandler = null,
    resolver: IResolver = null,
    sanitizer: ISanitizer = null
  ): ICloneOptions = {
    val __obj = js.Dynamic.literal()
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter.asInstanceOf[js.Any])
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(sanitizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloneOptions]
  }
}

