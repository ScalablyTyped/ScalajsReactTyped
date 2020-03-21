package typingsJapgolly.hexo.mod.extend

import typingsJapgolly.connect.mod.Server
import typingsJapgolly.hexo.AnonDictkey
import typingsJapgolly.hexo.AnonPath
import typingsJapgolly.hexo.hexoStrings.after_clean
import typingsJapgolly.hexo.hexoStrings.after_generate
import typingsJapgolly.hexo.hexoStrings.after_init
import typingsJapgolly.hexo.hexoStrings.after_post_render
import typingsJapgolly.hexo.hexoStrings.after_renderColonhtml
import typingsJapgolly.hexo.hexoStrings.before_exit
import typingsJapgolly.hexo.hexoStrings.before_generate
import typingsJapgolly.hexo.hexoStrings.before_post_render
import typingsJapgolly.hexo.hexoStrings.new_post_path
import typingsJapgolly.hexo.hexoStrings.post_permalink
import typingsJapgolly.hexo.hexoStrings.server_middleware
import typingsJapgolly.hexo.hexoStrings.template_locals
import typingsJapgolly.hexo.mod.Post.Data
import typingsJapgolly.hexo.mod.TemplateLocals
import typingsJapgolly.hexo.mod.extend.Filter.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter_ extends js.Object {
  def exec(`type`: String): js.Any = js.native
  def exec(`type`: String, data: js.Any): js.Any = js.native
  def exec(`type`: String, data: js.Any, options: Options): js.Any = js.native
  def execSync(`type`: String): js.Any = js.native
  def execSync(`type`: String, data: js.Any): js.Any = js.native
  def execSync(`type`: String, data: js.Any, options: Options): js.Any = js.native
  def register(`type`: String, fn: js.Function2[/* data */ js.Any, /* repeated */ js.Any, _]): Unit = js.native
  def register(`type`: String, fn: js.Function2[/* data */ js.Any, /* repeated */ js.Any, _], priority: Double): Unit = js.native
  /**
    * Executed after generated files and cache are removed with hexo clean command.
    */
  @JSName("register")
  def register_afterclean(`type`: after_clean, fn: js.Function0[Unit]): Unit = js.native
  @JSName("register")
  def register_afterclean(`type`: after_clean, fn: js.Function0[Unit], priority: Double): Unit = js.native
  /**
    * Executed after generation finishes.
    */
  @JSName("register")
  def register_aftergenerate(`type`: after_generate, fn: js.Function0[Unit]): Unit = js.native
  @JSName("register")
  def register_aftergenerate(`type`: after_generate, fn: js.Function0[Unit], priority: Double): Unit = js.native
  /**
    * Executed after Hexo is initialized – this will run right after `hexo.init` completes.
    */
  @JSName("register")
  def register_afterinit(`type`: after_init, fn: js.Function0[Unit]): Unit = js.native
  @JSName("register")
  def register_afterinit(`type`: after_init, fn: js.Function0[Unit], priority: Double): Unit = js.native
  /**
    * Executed after a post is rendered. Refer to post rendering to learn the execution steps.
    */
  @JSName("register")
  def register_afterpostrender(`type`: after_post_render, fn: js.Function1[/* data */ AnonDictkey, AnonDictkey | Unit]): Unit = js.native
  @JSName("register")
  def register_afterpostrender(
    `type`: after_post_render,
    fn: js.Function1[/* data */ AnonDictkey, AnonDictkey | Unit],
    priority: Double
  ): Unit = js.native
  /**
    * Executed after rendering finishes. You can see rendering for more info.
    */
  @JSName("register")
  def register_afterrenderhtml(
    `type`: after_renderColonhtml,
    fn: js.Function2[/* result */ String, /* data */ AnonPath, String | Unit]
  ): Unit = js.native
  @JSName("register")
  def register_afterrenderhtml(
    `type`: after_renderColonhtml,
    fn: js.Function2[/* result */ String, /* data */ AnonPath, String | Unit],
    priority: Double
  ): Unit = js.native
  /**
    * Executed before Hexo is about to exit – this will run right after `hexo.exit` is called.
    */
  @JSName("register")
  def register_beforeexit(`type`: before_exit, fn: js.Function0[Unit]): Unit = js.native
  @JSName("register")
  def register_beforeexit(`type`: before_exit, fn: js.Function0[Unit], priority: Double): Unit = js.native
  /**
    * Executed before generation begins.
    */
  @JSName("register")
  def register_beforegenerate(`type`: before_generate, fn: js.Function1[/* data */ js.Any, _]): Unit = js.native
  @JSName("register")
  def register_beforegenerate(`type`: before_generate, fn: js.Function1[/* data */ js.Any, _], priority: Double): Unit = js.native
  /**
    * Executed before a post is rendered. Refer to post rendering to learn the execution steps.
    */
  @JSName("register")
  def register_beforepostrender(`type`: before_post_render, fn: js.Function1[/* data */ AnonDictkey, AnonDictkey | Unit]): Unit = js.native
  @JSName("register")
  def register_beforepostrender(
    `type`: before_post_render,
    fn: js.Function1[/* data */ AnonDictkey, AnonDictkey | Unit],
    priority: Double
  ): Unit = js.native
  /**
    * Executed when creating a post to determine the path of new posts.
    */
  @JSName("register")
  def register_newpostpath(`type`: new_post_path, fn: js.Function2[/* data */ Data, /* replace */ js.UndefOr[Boolean], Unit]): Unit = js.native
  @JSName("register")
  def register_newpostpath(
    `type`: new_post_path,
    fn: js.Function2[/* data */ Data, /* replace */ js.UndefOr[Boolean], Unit],
    priority: Double
  ): Unit = js.native
  /**
    * Used to determine the permalink of posts.
    */
  @JSName("register")
  def register_postpermalink(`type`: post_permalink, fn: js.Function1[/* permalink */ String, String]): Unit = js.native
  @JSName("register")
  def register_postpermalink(`type`: post_permalink, fn: js.Function1[/* permalink */ String, String], priority: Double): Unit = js.native
  /**
    * Add middleware to the server. app is a Connect instance.
    */
  @JSName("register")
  def register_servermiddleware(`type`: server_middleware, fn: js.Function1[/* app */ Server, Server | Unit]): Unit = js.native
  @JSName("register")
  def register_servermiddleware(`type`: server_middleware, fn: js.Function1[/* app */ Server, Server | Unit], priority: Double): Unit = js.native
  /**
    * Modify [local variables](https://hexo.io/docs/variables) in templates.
    */
  @JSName("register")
  def register_templatelocals(`type`: template_locals, fn: js.Function1[/* locals */ TemplateLocals, TemplateLocals | Unit]): Unit = js.native
  @JSName("register")
  def register_templatelocals(
    `type`: template_locals,
    fn: js.Function1[/* locals */ TemplateLocals, TemplateLocals | Unit],
    priority: Double
  ): Unit = js.native
  def unregister(`type`: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

