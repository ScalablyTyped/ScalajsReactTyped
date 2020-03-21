package typingsJapgolly.beanstalkd.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.beanstalkd.beanstalkdStrings.on
import typingsJapgolly.beanstalkd.beanstalkdStrings.unref
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdCaller extends js.Object {
  def call[K /* <: Exclude[
    FunctionsNames[BeanstalkdClient], 
    on | unref | typingsJapgolly.beanstalkd.beanstalkdStrings.call
  ] */](
    fn: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsType<Required<BeanstalkdClient>[K]> is not an array type */ args: ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
    ]
  ): (MergePromise[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
    ]
  ]) with BeanstalkdCaller
}

object BeanstalkdCaller {
  @scala.inline
  def apply(
    call: (js.Any, ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
    ]) => CallbackTo[
      (MergePromise[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
        ]
      ]) with BeanstalkdCaller
    ]
  ): BeanstalkdCaller = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.beanstalkd.mod.ArgsType[
  /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any]) => call(t0, t1).runNow()))
    __obj.asInstanceOf[BeanstalkdCaller]
  }
}

