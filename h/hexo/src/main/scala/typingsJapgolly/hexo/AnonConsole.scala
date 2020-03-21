package typingsJapgolly.hexo

import typingsJapgolly.hexo.mod.extend.Console
import typingsJapgolly.hexo.mod.extend.Deployer
import typingsJapgolly.hexo.mod.extend.Filter
import typingsJapgolly.hexo.mod.extend.Generator
import typingsJapgolly.hexo.mod.extend.Helper
import typingsJapgolly.hexo.mod.extend.Migrator
import typingsJapgolly.hexo.mod.extend.Processor
import typingsJapgolly.hexo.mod.extend.Renderer
import typingsJapgolly.hexo.mod.extend.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsole extends js.Object {
  /**
    * The console forms the bridge between Hexo and its users. It registers and describes the available console commands.
    */
  val console: Console
  /**
    * A deployer helps users quickly deploy their site to a remote server without complicated commands.
    */
  val deployer: Deployer
  /**
    * A filter is used to modify some specified data. Hexo passes data to filters in sequence and the filters then modify the data one after the other.
    */
  val filter: Filter
  /**
    * A generator builds routes based on processed files.
    */
  val generator: Generator
  /**
    * A helper makes it easy to quickly add snippets to your templates. We recommend using helpers instead of templates when you’re dealing with more complicated code.
    */
  val helper: Helper
  /**
    * A migrator helps users migrate from other systems to Hexo.
    */
  val migrator: Migrator
  /**
    * A processor is used to process source files in the source folder.
    */
  val processor: Processor
  /**
    * A renderer is used to render content.
    */
  val renderer: Renderer
  /**
    * A tag allows users to quickly and easily insert snippets into their posts.
    */
  val tag: Tag
}

object AnonConsole {
  @scala.inline
  def apply(
    console: Console,
    deployer: Deployer,
    filter: Filter,
    generator: Generator,
    helper: Helper,
    migrator: Migrator,
    processor: Processor,
    renderer: Renderer,
    tag: Tag
  ): AnonConsole = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], deployer = deployer.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], migrator = migrator.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConsole]
  }
}

