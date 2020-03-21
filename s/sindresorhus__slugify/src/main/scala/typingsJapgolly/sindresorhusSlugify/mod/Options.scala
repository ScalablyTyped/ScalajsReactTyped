package typingsJapgolly.sindresorhusSlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Specifying this only replaces the default if you set an item with the same key, like `&`.
  		The replacements are run on the original string before any other transformations.
  		Add a leading and trailing space to the replacement to have it separated by dashes.
  		@default [ ['&', ' and '], ['🦄', ' unicorn '], ['♥', ' love '] ]
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('Foo@unicorn', {
  			customReplacements: [
  				['@', 'at']
  			]
  		});
  		//=> 'fooatunicorn'
  		slugify('foo@unicorn', {
  			customReplacements: [
  				['@', ' at ']
  			]
  		});
  		//=> 'foo-at-unicorn'
  		```
  		*/
  val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
  /**
  		Convert camelcase to separate words. Internally it does `fooBar` → `foo bar`.
  		@default true
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('fooBar');
  		//=> 'foo-bar'
  		slugify('fooBar', {decamelize: false});
  		//=> 'foobar'
  		```
  		*/
  val decamelize: js.UndefOr[Boolean] = js.undefined
  /**
  		Make the slug lowercase.
  		@default true
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('Déjà Vu!');
  		//=> 'deja-vu'
  		slugify('Déjà Vu!', {lowercase: false});
  		//=> 'Deja-Vu'
  		```
  		*/
  val lowercase: js.UndefOr[Boolean] = js.undefined
  /**
  		@default '-'
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('BAR and baz');
  		//=> 'bar-and-baz'
  		slugify('BAR and baz', {separator: '_'});
  		//=> 'bar_and_baz'
  		```
  		*/
  val separator: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    customReplacements: js.Array[js.Tuple2[String, String]] = null,
    decamelize: js.UndefOr[Boolean] = js.undefined,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (customReplacements != null) __obj.updateDynamic("customReplacements")(customReplacements.asInstanceOf[js.Any])
    if (!js.isUndefined(decamelize)) __obj.updateDynamic("decamelize")(decamelize.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

