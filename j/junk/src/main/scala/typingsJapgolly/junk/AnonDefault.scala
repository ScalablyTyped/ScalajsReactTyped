package typingsJapgolly.junk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  /**
  	Regex used for matching junk files.
  	*/
  val regex: js.RegExp
  /**
  	Returns `true` if `filename` matches a junk file.
  	*/
  def is(filename: String): Boolean
  /**
  	Returns `true` if `filename` doesn't match a junk file.
  	@example
  	```
  	import {promisify} from 'util';
  	import * as fs from 'fs';
  	import junk = require('junk');
  	const pReaddir = promisify(fs.readdir);
  	(async () => {
  		const files = await pReaddir('some/path');
  		console.log(files);
  		//=> ['.DS_Store', 'test.jpg']
  		console.log(files.filter(junk.not));
  		//=> ['test.jpg']
  	})();
  	```
  	*/
  def not(filename: String): Boolean
}

object AnonDefault {
  @scala.inline
  def apply(is: String => CallbackTo[Boolean], not: String => CallbackTo[Boolean], regex: js.RegExp): AnonDefault = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("is")(js.Any.fromFunction1((t0: java.lang.String) => is(t0).runNow()))
    __obj.updateDynamic("not")(js.Any.fromFunction1((t0: java.lang.String) => not(t0).runNow()))
    __obj.asInstanceOf[AnonDefault]
  }
}

